package com.jnshu.carrots.serviceadmin.dao;

import java.util.Map;

public class Info {
    int code;
    String message;
    Map data;

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Info(int code, String message, Map data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Info(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public Info(){}
}
