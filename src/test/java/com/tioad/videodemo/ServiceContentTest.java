package com.tioad.videodemo;

import com.tioad.videodemo.dao.CategoryMapper;
import com.tioad.videodemo.dao.ContentMapper;
import com.tioad.videodemo.entity.Category;
import com.tioad.videodemo.entity.Content;
import com.tioad.videodemo.util.Time;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/20
 */
@SpringBootTest
public class ServiceContentTest {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ContentMapper contentMapper;

    @Test
    public void test1(){

    }

}
