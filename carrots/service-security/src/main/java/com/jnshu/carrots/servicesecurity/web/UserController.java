package com.jnshu.carrots.servicesecurity.web;

import com.jnshu.carrots.servicesecurity.dto.UserLoginDTO;
import com.jnshu.carrots.servicesecurity.entity.User;
import com.jnshu.carrots.servicesecurity.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpCookie;
import java.sql.Time;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
@RestController
public class UserController {
    @Autowired
    UserService userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username ,@RequestParam("password") String password){
        //参数判断，省略
       return userServiceDetail.insertUser(username,password);
    }

//    @PostMapping("/login")
//    public ModelAndView login(@RequestParam("username") String username , @RequestParam("password") String password,Model model){
//        //参数判断，省略
//
//        userServiceDetail.login(username,password);
//        model.addAttribute("blogsList", userServiceDetail.login(username,password));
//        return new ModelAndView("token", "token", model);
//    }

    @PostMapping("/log")
    public UserLoginDTO login(@RequestParam("username") String username , @RequestParam("password") String password){
        //参数判断，省略
        return userServiceDetail.login(username,password);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/user/info")
    public String info() {
        return "hhhhhhhhhhhhhhhhhhhhhh";
    }

}
