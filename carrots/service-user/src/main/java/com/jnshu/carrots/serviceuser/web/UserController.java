package com.jnshu.carrots.serviceuser.web;

import com.jnshu.carrots.serviceuser.dto.UserLoginDTO;
import com.jnshu.carrots.serviceuser.entity.User;
import com.jnshu.carrots.serviceuser.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        //参数判断，省略
        return userServiceDetail.insertUser(username, password);
    }

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse httpServletResponse) {
        //参数判断，省略

        UserLoginDTO userLoginDTO = userServiceDetail.login(username, password);
        String userName = userLoginDTO.getUser().getUsername();

        Cookie cookie = new Cookie("username", userName);
        System.out.println(cookie);
        httpServletResponse.addCookie(cookie);
        return userLoginDTO;
    }


    @GetMapping("/cookie")
    public Cookie cook(HttpServletResponse httpServletResponse) {

        Cookie cookie = new Cookie("userName", "lllllllllll");
        System.out.println(cookie);
        httpServletResponse.addCookie(cookie);
        return cookie;
    }

    @GetMapping("/getCookie")
    public Cookie[] cook(HttpServletRequest request) {

        Cookie cookie[] = request.getCookies();
        System.out.println(cookie[0].getValue());
        return cookie;
    }
}
