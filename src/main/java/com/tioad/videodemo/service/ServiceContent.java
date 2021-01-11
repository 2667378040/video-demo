package com.tioad.videodemo.service;

import com.tioad.videodemo.dao.CategoryMapper;
import com.tioad.videodemo.dao.ContentMapper;
import com.tioad.videodemo.entity.Category;
import com.tioad.videodemo.entity.Content;
import com.tioad.videodemo.param.ReqContentParm;
import com.tioad.videodemo.util.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
@Service
public class ServiceContent {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ContentMapper contentMapper;

    public void insertContent(ReqContentParm parm) {
        Content content = contentMapper.selectContentByNameAndCategoryName(parm);

        if(content.getName().isEmpty()){
            Category category = categoryMapper.selectCategoryByName(parm.getCategoryName());
            Content c = new Content(parm.getName(), category.getId() , Time.MyDate(),Time.MyDate());
            contentMapper.insertContent(c);
        }

    }

    public List<Content> selectContentsByCategoryId(Integer id) {
        return contentMapper.selectContentsByCategoryId(id);
    }
}
