package com.tioad.videodemo;

import com.tioad.videodemo.entity.Content;
import com.tioad.videodemo.service.ServiceCategory;
import com.tioad.videodemo.service.ServiceContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/20
 */
@SpringBootTest
public class ServicePlayTest {
    @Autowired
    ServiceCategory serviceCategory;
    @Autowired
    ServiceContent serviceContent;

    @Test
    public void getPlay(){
        for (int i = 0; i < 10; i++) {
            List<Content> contents = serviceContent.selectContentsByCategoryId(3);
            System.out.println((int)Math.random()*15);
            System.out.println((int)Math.random()*contents.size());
//            Content content = contents.get((int)Math.random()*c);
//            System.out.println(content.getName());
        }

    }
}
