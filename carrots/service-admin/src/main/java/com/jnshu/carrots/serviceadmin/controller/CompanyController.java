package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Company;
import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * @Author 李景磊
 * @Description 
 * @Date 2018/9/27 16:44
 * @Param 
 * @return 
 */
@RequestMapping("/a/u/company")
@RestController
public class CompanyController {
    /**
     * @param currentPage 当前页码
     * @param size        每页行数
     * @return
     */
    @ApiOperation(value = "获取公司列表", notes = "获取所有公司列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info companyList(@RequestParam(defaultValue = "51463") String companyName, @RequestParam(defaultValue = "0") int companyTrade, @RequestParam(defaultValue = "4166")String companyProductName,@RequestParam(defaultValue = "0") int companyAut,@RequestParam(defaultValue = "0") int companyStatus,@RequestParam(defaultValue = "0") int companySize,@RequestParam(defaultValue = "北京") String companyArea,@RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10")int size) {
        Info info = new Info();
        Map data = new HashMap(16);
        List list = new ArrayList();
        Company re = new Company("测试：返回搜索条件" + companyName, companyTrade, companyProductName, companyAut, companyStatus, companySize, companyArea);
        int total = 1000;
        for (Integer i = (currentPage - 1) * size + 1; i <= currentPage * size; i++) {
            Company company = new Company(i);
            list.add(company);
        }
        list.set(0, re);
        data.put("total", total);
        data.put("companyList", list);
        info.setCode(0000);
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    @ApiOperation(value = "新增公司", notes = "增加新的公司", produces = "application/json")
    @PostMapping
    public Info add(String companyName, String companyLogo, int companyTrade, int companyAut, String companyTag, int companyPeople, int companyStatus, String companyArea, String companySlogan, int companySize, String companyProductName, String companyProductLogo, String companyProductSlogan, String companyProductCaption, String companyPhone, String companyEmail, String companyAddr, String companyMap, String companyCaption) {
        Map data = new HashMap(16);
        Company company = new Company(companyName, companyLogo, companyTrade, companyAut, companyTag, companyPeople, companyStatus, companyArea, companySlogan, companySize, companyProductName, companyProductLogo, companyProductSlogan, companyProductCaption, companyPhone, companyEmail, companyAddr, companyMap, companyCaption);
        data.put("company", company);
        Info info = Return.getInfo(company, data);
        return info;
    }


    @ApiOperation(value = "公司详情", notes = "根据id获取公司详情", produces = "application/json")
    @GetMapping
    public Info get(int companyId) {
        Map data = new HashMap(16);
        Company company = new Company(companyId);
        data.put("company", company);
        Info info = Return.getInfo(company, data);
        return info;
    }

    @ApiOperation(value = "公司信息修改", notes = "根据id修改公司信息", produces = "application/json")
    @PutMapping
    public Info update(String companyName, String companyLogo, int companyTrade, int companyAut, String companyTag, int companyPeople, int companyStatus, String companyArea, String companySlogan, int companySize, String companyProductName, String companyProductLogo, String companyProductSlogan, String companyProductCaption, String companyPhone, String companyEmail, String companyAddr, String companyMap, String companyCaption) {
        return add(companyName, companyLogo, companyTrade, companyAut, companyTag, companyPeople, companyStatus, companyArea, companySlogan, companySize, companyProductName, companyProductLogo, companyProductSlogan, companyProductCaption, companyPhone, companyEmail, companyAddr, companyMap, companyCaption);
    }

    @ApiOperation(value = "删除公司", notes = "根据id删除公司", produces = "application/json")
    @DeleteMapping
    public Info delete(int companyId) {
        return get(companyId);
    }

    @ApiOperation(value = "修改认证状态", notes = "根据id修改公司认证状态", produces = "application/json")
    @PutMapping(value = "/aut")
    public Info aut(int companyId, int companyAut) {
        Info info = Return.getInfo(companyAut + companyId + "");
        return info;
    }

    @ApiOperation(value = "修改冻结状态", notes = "根据id修改公司冻结状态", produces = "application/json")
    @PutMapping(value = "/status")
    public Info status(int companyId, int companyStatus) {
        Info info = Return.getInfo(companyStatus + companyId + "");
        return info;
    }
}

