package com.tioad.videodemo.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public class Time {

    public static Date MyDate(){
        return new Date();
    }

    public static String MyDateTime(){
        Date date = new Date();
        date.getTime();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        new java.sql.Date(new Date().getTime());
        return format;
    }

    public static LocalDateTime MyLocalDateTime(){
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
