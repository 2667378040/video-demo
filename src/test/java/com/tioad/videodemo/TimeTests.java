package com.tioad.videodemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/15
 */

@SpringBootTest
public class TimeTests {

    @Test
    public void test1(){

        System.out.println("--  --  --  --");
        System.out.println(new Date());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    @Test
    public void test2(){
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void test3(){
        String format = new SimpleDateFormat("yyyyMMdd").format(new Date());
        System.out.println(format);

        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void test4(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getTime());
        System.out.println(new Date());

    }
}
