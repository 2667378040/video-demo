package com.tioad.videodemo.dao;

import com.tioad.videodemo.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
@Repository
public interface CategoryMapper {
    void insertCategory(Category category);

    Category selectCategoryByName(String categoryName);

    List<Category> getCategoryList();
}
