package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.RolePerm;

public interface RolePermMapper {
    int deleteByPrimaryKey(Long rpId);

    int insert(RolePerm record);

    int insertSelective(RolePerm record);

    RolePerm selectByPrimaryKey(Long rpId);

    int updateByPrimaryKeySelective(RolePerm record);

    int updateByPrimaryKey(RolePerm record);
}