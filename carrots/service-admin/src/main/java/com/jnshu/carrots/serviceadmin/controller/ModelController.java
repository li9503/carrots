package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Model;
import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.dao.Role;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:19
 * @Param
 * @return
 */
@RestController
@RequestMapping("/a/u/model")
public class ModelController {
    @ApiOperation(value = "获取模块列表", notes = "获取所有模块列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info modelList(@RequestParam(defaultValue = "1")int currentPage,@RequestParam(defaultValue = "10") int size) {
        Info info = new Info();
        Map data = new HashMap(16);
        List list = Model.modelList();
        int total = list.size();
        List modelList;
        if (currentPage * size <= total) {
            modelList = list.subList((currentPage - 1) * size, currentPage * size);
        } else if ((currentPage - 1) * size > total) {
            modelList = null;
        }else {
            modelList = list;
        }
        data.put("total", total);
        data.put("modelList", modelList);
        info.setCode(0000);
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    @ApiOperation(value = "新增模块", notes = "增加新的模块", produces = "application/json")
    @PostMapping
    public Info add(String modelName, String modelURL, int modelParent, String modelType) {

        Info info = Return.getInfo(modelName + modelParent + modelType + modelURL);
        return info;
    }
/**
 *
 * @Author 李景磊
 * @Description
 * @Date 2018/9/28 0:10
 * @Param [modelId]
 * @return com.jnshu.carrots.serviceadmin.dao.Info
 */
    @ApiOperation(value = "模块详情", notes = "根据id获取模块详情", produces = "application/json")
    @GetMapping
    public Info get(int modelId) {
        System.out.println(modelId);
        Map data = new HashMap(16);
        List list = Model.modelList();
        Model model = (Model) list.get(modelId-1);
        data.put("model", model);
        return Return.getInfo(modelId,data);
    }

    @ApiOperation(value = "模块信息修改", notes = "根据id修改模块信息", produces = "application/json")
    @PutMapping
    public Info update(String modelName, String modelURL, int modelParent, String modelType) {
        return add(modelName, modelURL, modelParent, modelType);
    }

    @ApiOperation(value = "删除模块", notes = "根据id删除模块", produces = "application/json")
    @DeleteMapping
    public Info delete(int modelId) {
        return Return.getInfo(modelId);
    }

    @ApiOperation(value = "获取所有模块MenuId和角色名")
    @GetMapping("/all")
    public Info all() {
        Map data = new HashMap(16);
        List list = Model.modelListSimple();
        int code = 0000;
        String message = "success";
        data.put("modelList", list);
        if (list == null) {
            code = 1000;
            message = "failed";
        }
        return new Info(code, message, data);
    }

}
