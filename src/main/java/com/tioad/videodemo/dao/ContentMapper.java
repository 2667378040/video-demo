package com.tioad.videodemo.dao;

import com.tioad.videodemo.entity.Content;
import com.tioad.videodemo.param.ReqContentParm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
@Repository
public interface ContentMapper {

    void insertContent(Content content);

    List<Content> getContentList();

    Content selectContentByNameAndCategoryName(ReqContentParm parm);

    List<Content> selectContentsByCategoryId(Integer id);
}
