package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.Perm;

public interface PermMapper {
    int deleteByPrimaryKey(Long permId);

    int insert(Perm record);

    int insertSelective(Perm record);

    Perm selectByPrimaryKey(Long permId);

    int updateByPrimaryKeySelective(Perm record);

    int updateByPrimaryKey(Perm record);
}