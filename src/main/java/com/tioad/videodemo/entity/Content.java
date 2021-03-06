package com.tioad.videodemo.entity;

import java.util.Date;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public class Content {
    private Integer id;
    private String name;
    private Integer categoryId;
    private Date addTime;
    private Date updateTime;
    private Integer deleted;

    public Content() {
    }

    public Content(String name, Integer categoryId, Date addTime, Date updateTime) {
        this.name = name;
        this.categoryId = categoryId;
        this.addTime = addTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
