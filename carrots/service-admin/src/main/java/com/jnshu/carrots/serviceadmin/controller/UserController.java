package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.User;
import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:19
 * @Param
 * @return
 */
@RequestMapping("/a/u/user")
@RestController
public class UserController {
    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:17
     * @Param [roleName, userName, currentPage, size]
     */
    @ApiOperation(value = "获取用户列表", notes = "获取所有用户列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info userList(@RequestParam(defaultValue = "n")String roleName, @RequestParam(defaultValue = "n")String userName, @RequestParam(defaultValue = "1")int currentPage,@RequestParam(defaultValue = "10") int size) {
        roleName="asda";
        userName="dsad";
        Map data = new HashMap(16);
        List userList = User.userList();
        data.put("total", userList.size());
        data.put("userList", userList);
        return Return.getInfo(roleName + userName + currentPage + size, data);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:17
     * @Param [userName, userTime, userType, userCaption, userJumpUrl, userTrade, userUrl, userStatus]
     */
    @ApiOperation(value = "新增用户", notes = "增加新的用户", produces = "application/json")
    @PostMapping
    public Info add(String userName, int roleId, String userPassword, String userPhone) {
        Map data = new HashMap(16);
        User user = new User(0, userName, roleId, userPhone, userPassword);
        data.put("user", user);
        Info info = Return.getInfo(user, data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:27
     * @Param [userId]
     */
    @ApiOperation(value = "用户详情", notes = "根据id获取用户详情", produces = "application/json")
    @GetMapping
    public Info get(int userId) {
        Map data = new HashMap(16);
        data.put("user", User.userList().get(userId - 1));
        Info info = Return.getInfo(userId, data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:26
     * @Param [userName, userRole, userPassword, userPhone]
     */
    @ApiOperation(value = "用户信息修改", notes = "根据id修改用户信息", produces = "application/json")
    @PutMapping
    public Info update(String userName, int roleId,  String userPhone) {
        return add(userName, roleId, "", userPhone);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:26
     * @Param [userId]
     */
    @ApiOperation(value = "删除用户", notes = "根据id删除用户", produces = "application/json")
    @DeleteMapping
    public Info delete(int userId) {
        return get(userId);
    }
}
