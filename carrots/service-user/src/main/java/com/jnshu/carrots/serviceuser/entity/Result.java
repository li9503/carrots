package com.jnshu.carrots.serviceuser.entity;


/**
 * Created on 2018/5/24.
 *
 * @author zlf
 * @since 1.0
 */
public class Result<T> {
    private Integer code;
    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
