package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.dao.Role;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:46
 * @Param
 * @return
 */
@RequestMapping("/a/u/role")
@RestController
public class RoleController {
    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/27 20:16
     * @Param [currentPage, size]
     */
    @ApiOperation(value = "获取角色列表", notes = "获取所有角色列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info roleList(@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int size) {
        Map data = new HashMap(16);
        List list = Role.roleList();
        int code = 0000;
        String message = "success";
        data.put("total", list.size());
        data.put("roleList", list);
        if (currentPage + size == 0) {
            code = 1000;
            message = "failed";
        }
        return new Info(code, message, data);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 0:09
     * @Param [roleName]
     */
    @ApiOperation(value = "新增角色", notes = "增加新的角色", produces = "application/json")
    @PostMapping
    public Info add(String roleName) {
        return Return.getInfo(roleName);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 0:14
     * @Param [roleId]
     */
    @ApiOperation(value = "角色详情", notes = "根据id获取角色详情", produces = "application/json")
    @GetMapping
    public Info get(int roleId) {
        Map data = new HashMap(16);
        data.put("role", Role.roleList().get(roleId - 1));
        return Return.getInfo(roleId, data);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 0:17
     * @Param [roleName]
     */
    @ApiOperation(value = "角色信息修改", notes = "根据id修改角色信息", produces = "application/json")
    @PutMapping
    public Info update(String roleName) {
        return add(roleName);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 0:18
     * @Param [roleId]
     */
    @ApiOperation(value = "删除角色", notes = "根据id删除角色", produces = "application/json")
    @DeleteMapping
    public Info delete(int roleId) {
        return get(roleId);
    }

    @ApiOperation(value = "获取所有角色id和角色名")
    @GetMapping("/all")
    public Info all() {
        Map data = new HashMap(16);
        List list = Role.roleListSimple();
        int code = 0000;
        String message = "success";
        data.put("roleList", list);
        if (list == null) {
            code = 1000;
            message = "failed";
        }
        return new Info(code, message, data);
    }


}
