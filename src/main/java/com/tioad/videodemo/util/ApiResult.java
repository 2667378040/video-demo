package com.tioad.videodemo.util;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public class ApiResult<T> {

    public Integer code;
    public String message;
    public T data;

    public ApiResult() {
    }

    public ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResult build(){
        return new ApiResult();
    }

    public static ApiResult build(Integer code, String message){
        return new ApiResult(code,message);
    }

    public ApiResult success(){
        this.code = 200;
        this.message = "";
        return this;
    }

    public ApiResult success(T data){
        this.code = 200;
        this.message = "";
        this.data = data;
        return this;
    }

    public ApiResult success(String message , T data){
        this.code = 200;
        this.message = message;
        this.data = data;
        return this;
    }

    public ApiResult failure(int code , String message){
        return build(code,message);
    }
}
