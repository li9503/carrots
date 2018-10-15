package com.jnshu.carrots.backstageservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.carrots.backstageservice.dao.BannerMapper;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/9 20:39
 * @ModifiedBy：
 */
@Service("bannerService")
public class BannerServiceImpl implements BannerService {


    @Autowired
    BannerMapper bannerDao;

    @Override
    public PageInfo<Banner> getImageList(Banner banner,int currentPage, int size) {
        PageHelper.startPage(currentPage, size);
        List<Banner> bannerList = bannerDao.selectForPage( banner);
        PageInfo<Banner> pageInfo = new PageInfo<Banner>(bannerList);
        return pageInfo;
    }


    @Override
    public boolean addImage(Banner image) {



        if (bannerDao.insertSelective(image) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateImage(Banner image) {
        if (bannerDao.updateByPrimaryKeySelective(image) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteImage(long imageId) {
        if (bannerDao.deleteByPrimaryKey(imageId) == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Banner getImage(long imageId) {
        return bannerDao.selectByPrimaryKey(imageId);
    }
}
