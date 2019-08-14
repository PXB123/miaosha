package com.miaoshaproject.error;

public enum EnumBusinessError implements CommonError {
    //通用错误类型10001
    PARAMETER_VALIDATION_ERROR(10001,"参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

   //20000开头的为用户信息相关错误定义
    USER_NOT_EXIST(20001,"用户不存在")
    ;
    private EnumBusinessError(int errCode,String errMag){
        this.errCode = errCode;
        this.errMsg = errMag;
    }
    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
