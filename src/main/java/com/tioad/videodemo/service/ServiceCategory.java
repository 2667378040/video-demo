package com.tioad.videodemo.service;

import com.tioad.videodemo.dao.CategoryMapper;
import com.tioad.videodemo.entity.Category;
import com.tioad.videodemo.param.ReqCategoryParam;
import com.tioad.videodemo.util.ApiResult;
import com.tioad.videodemo.util.ErrorCode;
import com.tioad.videodemo.util.MyBizException;
import com.tioad.videodemo.util.Time;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/14
 */
@Service
public class ServiceCategory {

    Logger logger = LoggerFactory.getLogger(ServiceCategory.class);

    @Autowired
    private CategoryMapper categoryMapper;

    public void insertCategory(ReqCategoryParam parm) {
        Category category = categoryMapper.selectCategoryByName(parm.getName());



        if(category.getName().isEmpty()){
            Category c = new Category(parm.getName(),Time.MyDate(),Time.MyDate());
            categoryMapper.insertCategory(c);
            logger.info("新增类别成功");

        }

        logger.error("新增类别失败，该类别已存在");
        throw new MyBizException(ErrorCode.ERROR_CATEGORY_INSERT);

    }

    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }
}
