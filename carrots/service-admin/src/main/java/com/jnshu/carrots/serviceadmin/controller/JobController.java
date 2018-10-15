package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Job;
import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 李景磊
 * @Description 
 * @Date 2018/9/27 16:45
 * @Param 
 * @return 
 */
@RequestMapping("/a/u/job")
@RestController
public class JobController {
    /**
     * @param currentPage 当前页码
     * @param size        每页行数
     * @return
     */
    @ApiOperation(value = "获取职位列表", notes = "获取所有职位列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info jobList(@RequestParam(defaultValue = "1")String jobCompany,@RequestParam(defaultValue = "2") String jobName, @RequestParam(defaultValue = "1")int jobType,@RequestParam(defaultValue = "2") int jobEducation, @RequestParam(defaultValue = "1")int jobExp,@RequestParam(defaultValue = "1") int jobSalary,@RequestParam(defaultValue = "0") int jobStatus,@RequestParam(defaultValue = "65416468") long firstTime,@RequestParam(defaultValue = "4166146") long lastTime, @RequestParam(defaultValue = "1")int currentPage, @RequestParam(defaultValue = "10")int size) {
        Info info = new Info();
        Map data = new HashMap(16);
        List list = new ArrayList();
        Job re = new Job("测试：返回搜索条件" + jobCompany, jobName, jobType, jobEducation, jobExp, jobSalary, jobStatus, firstTime);
        int total = 1000;
        for (Integer i = (currentPage - 1) * size + 1; i <= currentPage * size; i++) {
            Job job = new Job(i);
            list.add(job);
        }
        list.set(0, re);
        data.put("total", total);
        data.put("jobList", list);
        info.setCode(0000);
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    @ApiOperation(value = "新增职位", notes = "增加新的职位", produces = "application/json")
    @PostMapping
    public Info add(String jobName, String jobCompany, int jobSalary, int jobPriority, int jobType, int jobLevel, int jobStatus, int jobExp, int jobEducation, String jobTag, String jobWelfare, String jobCaption, String jobRequirement) {
        Map data = new HashMap(16);
        Job job = new Job(jobName, jobCompany, jobSalary, jobPriority, jobType, jobLevel, jobStatus, jobExp, jobEducation, jobTag, jobWelfare, jobCaption, jobRequirement);
        data.put("job", job);
        Info info = Return.getInfo(job, data);
        return info;
    }

    @ApiOperation(value = "职位详情", notes = "根据id获取职位详情", produces = "application/json")
    @GetMapping
    public Info get(int jobId) {
        Map data = new HashMap(16);
        Job job = new Job(jobId);
        data.put("job", job);
        Info info = Return.getInfo(job, data);
        return info;
    }

    @ApiOperation(value = "职位信息修改", notes = "根据id修改职位信息", produces = "application/json")
    @PutMapping
    public Info update(String jobName, String jobCompany, int jobSalary, int jobPriority, int jobType, int jobLevel, int jobStatus, int jobExp, int jobEducation, String jobTag, String jobWelfare, String jobCaption, String jobRequirement) {
        return add(jobName, jobCompany, jobSalary, jobPriority, jobType, jobLevel, jobStatus, jobExp, jobEducation, jobTag, jobWelfare, jobCaption, jobRequirement);
    }

    @ApiOperation(value = "删除职位", notes = "根据id删除职位", produces = "application/json")
    @DeleteMapping
    public Info delete(int jobId) {
        return get(jobId);
    }


    @ApiOperation(value = "修改冻结状态", notes = "根据id修改职位冻结状态", produces = "application/json")
    @PutMapping(value = "/status")
    public Info status(int jobId, int jobStatus) {
        Info info = Return.getInfo(jobStatus + jobId + "");
        return info;
    }
}
