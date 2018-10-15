package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.JobTwo;
import com.jnshu.carrots.backstageservice.model.JobTwoWithBLOBs;

public interface JobTwoMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(JobTwoWithBLOBs record);

    int insertSelective(JobTwoWithBLOBs record);

    JobTwoWithBLOBs selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(JobTwoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobTwoWithBLOBs record);

    int updateByPrimaryKey(JobTwo record);
}