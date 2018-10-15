package com.jnshu.carrots.serviceadmin.util;

import com.jnshu.carrots.serviceadmin.dao.Info;

import java.util.Map;

/**
 * @author ljl
 * 判断并封装返回数据
 */
public class Return {

    public static Info getInfo(Object o, Map data) {
        Info info = new Info();
        if (o.toString().indexOf("null") != -1 | data == null) {
            info.setCode(1000);
            info.setMessage("failed");
        } else {
            info.setCode(0000);
            info.setMessage("success");
            info.setData(data);
        }
        return info;
    }

    public static Info getInfo(Object o) {
        Info info = new Info();
        if (o.toString().indexOf("null") != -1 ) {
            info.setCode(1000);
            info.setMessage("failed");
        } else {
            info.setCode(0000);
            info.setMessage("success");
        }
        return info;
    }
}
