package com.tioad.videodemo.service;

import com.tioad.videodemo.dao.PlayMapper;
import com.tioad.videodemo.entity.Category;
import com.tioad.videodemo.entity.Content;
import com.tioad.videodemo.entity.Play;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
@Service
public class ServicePlay {

    Logger logger = LoggerFactory.getLogger(ServicePlay.class);

    @Autowired
    ServiceCategory serviceCategory;
    @Autowired
    ServiceContent serviceContent;
    @Autowired
    PlayMapper playMapper;

    public void getPlay() {
        List<Category> categoryList = serviceCategory.getCategoryList();
        Map<String,String> map = new HashMap<>();

        SXSSFWorkbook workbook = new SXSSFWorkbook();
        Sheet sheet = workbook.createSheet("剧本结构");
        String[] hedaers = {"视频名称","分镜序号","主题","环境","时间","场景","景别","人物","角色","机位","镜头运动","机位方向","收音","音乐","视效","内容及对白描述","剪辑点描述","视效需求描述","备注"};

        int rowIndex = 0;
        Row rowHeaders = sheet.createRow(rowIndex++);
        for (int j = 0; j <hedaers.length ; j++) {
            rowHeaders.createCell(j).setCellValue(hedaers[j]);
        }

        for (int i = 0; i < 10 ; i++) {
            for (Category category: categoryList) {
                List<Content> contents = serviceContent.selectContentsByCategoryId(category.getId());
                Content content = contents.get((int)(Math.random()*(contents.size())));
                map.put(category.getName(),content.getName());
            }

            Row rowContents = sheet.createRow(rowIndex++);
            String s = map.get("主题")+map.get("环境")+map.get("时间")+map.get("场景");
            rowContents.createCell(0).setCellValue(s);
            rowContents.createCell(1).setCellValue(rowIndex-1);
            rowContents.createCell(2).setCellValue(map.get("主题"));
            rowContents.createCell(3).setCellValue(map.get("环境"));
            rowContents.createCell(4).setCellValue(map.get("时间"));
            rowContents.createCell(5).setCellValue(map.get("场景"));
            rowContents.createCell(6).setCellValue(map.get("景别"));
            rowContents.createCell(7).setCellValue(map.get("人物"));
            rowContents.createCell(8).setCellValue(map.get("角色"));
            rowContents.createCell(9).setCellValue(map.get("机位"));
            rowContents.createCell(10).setCellValue(map.get("镜头运动"));
            rowContents.createCell(11).setCellValue(map.get("机位方向"));
            rowContents.createCell(12).setCellValue(map.get("收音"));
            rowContents.createCell(13).setCellValue(map.get("音乐"));
            rowContents.createCell(14).setCellValue(map.get("视效"));

            Play play = new Play(s , (rowIndex-1)+"" , map.get("主题") ,map.get("环境") , map.get("时间"),map.get("场景") ,map.get("景别") ,map.get("人物") ,map.get("角色") ,map.get("机位") ,map.get("镜头运动") ,map.get("机位方向") ,map.get("收音") ,map.get("音乐") ,map.get("视效") );
            playMapper.insertPlay(play);

        }

        logger.info("获取剧本成功");

        try {
            //my path
            //FileOutputStream fos = new FileOutputStream("C:\\Users\\chen yu\\Desktop\\短视频剧本结构编辑器.xlsx");
            FileOutputStream fos = new FileOutputStream(new File("").getCanonicalPath()+"\\短视频剧本结构编辑器.xlsx");
            workbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
