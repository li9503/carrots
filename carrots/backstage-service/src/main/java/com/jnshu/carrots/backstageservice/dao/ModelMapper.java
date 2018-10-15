package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(Long modelId);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Long modelId);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}