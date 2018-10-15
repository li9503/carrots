package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.dao.User;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:39
 */
@RequestMapping("/a/u")
@RestController
public class LoginController {

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/27 16:33
     * @Param [userName, userPassword]
     */
    @ApiOperation(value = "登录", notes = "输入账号密码登录", produces = "application/json")
    @PostMapping("/login")
    public Info login(String userName, String userPassword, HttpServletResponse httpServletResponse) {
        User user = new User();
        Map data = new HashMap(16);
        int code = 2002;
        String message = "failed";
        List userList = User.userList();
        for (int i = 0; i < userList.size(); i++) {
            User user1 = (User) userList.get(i);
            if (user1.getUserName().equals(userName)) {
                if (user1.getUserPassword().equals(userPassword)) {
                    user = user1;
                    code = 0000;
                    message = "success";
                    Cookie cookie = new Cookie("user", userName);
                    httpServletResponse.addCookie(cookie);
                    break;
                } else {
                    code = 2001;
                }
            }
        }
        data.put("roleName", user.getUserRole());
        data.put("userName", user.getUserName());
        Info info = new Info(code, message, data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/27 20:05
     * @Param [request]
     */
    @ApiOperation(value = "退出登录", notes = "退出登录，删除session", produces = "application/json")
    @GetMapping("/logout")
    public Info logout(HttpServletRequest request) {
        int code = 1000;
        String message = "faild";
        HttpSession session = request.getSession();
        String se = (String) session.getAttribute("user");
        if (null == se) {
            System.out.println("没有session==============");
        } else {
            session.setAttribute("user", null);
            System.out.println("清除session");
            code = 0000;
            message = "success";
        }
        Info info = new Info(code, message);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/27 20:13
     * @Param []
     */
    @ApiOperation(value = "获取菜单", notes = "获取菜单，一级菜单父ID为1024", produces = "application/json")
    @GetMapping("/menu")
    public Info menu() {
        return new ModelController().modelList(1, 100);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 15:25
     * @Param [userName, oldPassword, newPassword]
     */
    @ApiOperation(value = "修改密码", notes = "修改用户密码", produces = "application/json")
    @PutMapping("/password")
    public Info pwd(String userName, String oldPassword, String newPassword) {
        System.out.println(userName + oldPassword + newPassword);
        return Return.getInfo(userName + oldPassword + newPassword);
    }
}
