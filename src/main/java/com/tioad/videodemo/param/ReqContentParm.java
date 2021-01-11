package com.tioad.videodemo.param;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public class ReqContentParm {
    private String name;
    private String categoryName;

    public ReqContentParm() {
    }

    public ReqContentParm(String name, String categoryName) {
        this.name = name;
        this.categoryName = categoryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
