package com.jnshu.carrots.serviceuser.dto;

import com.jnshu.carrots.serviceuser.entity.JWT;
import com.jnshu.carrots.serviceuser.entity.User;


import java.util.List;

/**
 * Created by fangzhipeng on 2017/5/27.
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
