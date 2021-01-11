package com.tioad.videodemo.util;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public enum ErrorCode {
    /**
     * 类别错误
     */
    ERROR_CATEGORY_INSERT (1001,"类别已存在,增加失败");


    /**
     * 主键
     */
    private final Integer code;

    /**
     * 描述
     */
    private final String desc;

    ErrorCode(final Integer code, final String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
