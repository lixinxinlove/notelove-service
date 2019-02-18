package com.lixinxinlove.notelove.error;

/**
 * 统一错误接口
 */
public interface CommonError {

    int getErrCode();

    String getErrMsg();

    void setErrMsg(String errMsg);


}
