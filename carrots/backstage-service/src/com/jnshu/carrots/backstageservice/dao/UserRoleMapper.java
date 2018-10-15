package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long urId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long urId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}