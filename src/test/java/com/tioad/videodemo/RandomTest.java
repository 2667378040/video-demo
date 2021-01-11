package com.tioad.videodemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/20
 */
@SpringBootTest
public class RandomTest {

    @Test
    public void test1(){
        System.out.println((int)(Math.random()*2));
        System.out.println((int)(Math.random()*3));
        System.out.println((int)(Math.random()*4));
        System.out.println((int)(Math.random()*5));
        System.out.println((int)(Math.random()*6));

    }

    @Test
    public void test2(){
        List<String> list = new ArrayList<String>();
        int i = 0;
        while(i<10){
            list.add(i+"");
            i++;
        }

        /*System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));*/

        for (int j = 0; j < 100; j++) {
            double a = Math.random();
            double b = a*(list.size());
            String s = list.get((int)b);
            System.out.println(a);
            System.out.println(b);
            System.out.println(s);
            System.out.println("----------------");
        }



    }
}
