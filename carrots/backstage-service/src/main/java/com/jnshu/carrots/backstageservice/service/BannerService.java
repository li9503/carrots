package com.jnshu.carrots.backstageservice.service;

import com.github.pagehelper.PageInfo;
import com.jnshu.carrots.backstageservice.model.Banner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/9 10:42
 * @ModifiedBy：
 */
public interface BannerService {

    PageInfo<Banner> getImageList(Banner banner, int currentPage, int size);

    boolean addImage(Banner image);

    boolean updateImage(Banner image);

    boolean deleteImage(long imageId);

    Banner getImage(long imageId);
}
