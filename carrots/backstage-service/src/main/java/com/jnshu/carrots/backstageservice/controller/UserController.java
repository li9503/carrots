package com.jnshu.carrots.backstageservice.controller;

import com.jnshu.carrots.backstageservice.exception.Result;
import com.jnshu.carrots.backstageservice.model.User;
import com.jnshu.carrots.backstageservice.service.UserService;
import com.jnshu.carrots.backstageservice.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/12 0:43
 * @ModifiedBy：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/login")
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse httpServletResponse) {
        //参数判断，省略
        Result result = userService.loadUserByUsername(username, password);
        User user = (User) result.getData();
        if (user != null){
            Cookie cookie = new Cookie("user", username);
            httpServletResponse.addCookie(cookie);
        }
       String salt = MD5Util.salt();
       String md5= MD5Util.generate(password,salt);
        System.out.println(salt+"\n"+md5);
        return result;
    }
}
