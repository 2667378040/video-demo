package com.tioad.videodemo.controller;

import com.tioad.videodemo.param.ReqCategoryParam;
import com.tioad.videodemo.param.ReqContentParm;
import com.tioad.videodemo.service.ServiceCategory;
import com.tioad.videodemo.service.ServiceContent;
import com.tioad.videodemo.service.ServicePlay;
import com.tioad.videodemo.util.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/14
 */
@RestController
@RequestMapping(value = "/v1/play")
public class ControllerPlay {

    @Resource
    ServiceCategory serviceCategory;
    @Autowired
    ServiceContent serviceContent;
    @Autowired
    ServicePlay servicePlay;

    /**
     * 新增剧本类型
     * @param parm name 类别名称
     */
    @RequestMapping(value = "/insertCategory" , method= RequestMethod.POST)
    public ApiResult insertCategory(@RequestBody ReqCategoryParam parm){
        serviceCategory.insertCategory(parm);
        return ApiResult.build().success("添加类别成功!","类别为:"+parm.getName());
    }

    /**
     * 新增剧本内容
     * @param parm name 内容名称    categoryName 所属类别
     */
    @RequestMapping(value = "/insertContent" , method = RequestMethod.POST)
    public ApiResult insetContent(@RequestBody ReqContentParm parm){
        serviceContent.insertContent(parm);
        return ApiResult.build().success("添加内容成功!","内容为:"+parm.getName()+"; 所属类别:"+parm.getCategoryName());
    }

    /**
     *获取生成的剧本
     */
    @RequestMapping(value = "/getPlay" , method = RequestMethod.GET)
    public ApiResult getPlay(){
        servicePlay.getPlay();
        return ApiResult.build().success("获取剧本成功!");
    }

    @RequestMapping(value = "/test" , method = RequestMethod.POST)
    public ApiResult test(){
        return ApiResult.build().success();
    }


}
