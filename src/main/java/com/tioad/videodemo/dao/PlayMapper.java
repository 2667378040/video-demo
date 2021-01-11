package com.tioad.videodemo.dao;

import com.tioad.videodemo.entity.Play;
import org.springframework.stereotype.Repository;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/20
 */
@Repository
public interface PlayMapper {

    void insertPlay(Play play);
}
