package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.JobOne;

public interface JobOneMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(JobOne record);

    int insertSelective(JobOne record);

    JobOne selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(JobOne record);

    int updateByPrimaryKey(JobOne record);
}