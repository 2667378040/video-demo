package com.tioad.videodemo.util;

/**
 * @author : Chenyu
 * @version : 0.0.0
 * @time : 2020/10/19
 */
public class MyBizException extends RuntimeException{
    private ErrorCode errorCode;

    public MyBizException(ErrorCode errorCode){
        this.errorCode = errorCode;
    }

    public MyBizException(String msg , ErrorCode errorCode){
        super(msg);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
