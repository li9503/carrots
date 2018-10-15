package com.jnshu.carrots.backstageservice.dao;

import com.jnshu.carrots.backstageservice.model.Banner;

public interface BannerMapper {
    int deleteByPrimaryKey(Long imageId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Long imageId);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKeyWithBLOBs(Banner record);

    int updateByPrimaryKey(Banner record);
}