package com.jnshu.carrots.backstageservice.exception;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/11 21:58
 * @ModifiedBy：
 */
public enum ExceptionEnum {
    UNKNOW_ERROR(1000, "未知错误"),
    DATA_HAS_NULL(1001, "传入数据有空值"),

    DATA_NOT_FIND(2000, "数据不存在"),
    UPDATE_FAIL(2001, "更新失败"),
    USER_NOT_FIND(2003, "用户不存在"),
    PSW_ERROR(2004, "密码错误"),;

    private Integer code;

    private String message;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
