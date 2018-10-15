package com.jnshu.carrots.backstageservice.controller;

import com.github.pagehelper.PageInfo;
import com.jnshu.carrots.backstageservice.exception.ExceptionEnum;
import com.jnshu.carrots.backstageservice.exception.ExceptionHandle;
import com.jnshu.carrots.backstageservice.exception.Result;
import com.jnshu.carrots.backstageservice.util.ResultUtil;
import com.jnshu.carrots.backstageservice.model.Banner;
import com.jnshu.carrots.backstageservice.service.BannerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/9 20:53
 * @ModifiedBy：
 */
@RestController
@RequestMapping("/image")
public class ArticleController {

    @Autowired
    BannerService bannerService;
    @Autowired
    private ExceptionHandle exceptionHandle;

    /**
     * @return com.jnshu.carrots.backstageservice.exception.Result
     * @Author 李景磊
     * @Description
     * @Date 2018/10/12 0:00
     * @Param [banner, currentPage, size]
     */
    @ApiOperation(value = "获取图片列表", notes = "获取所有图片列表，首行返回搜索条件", produces = "application/json")
    @GetMapping(value = "/list", produces = "application/json")
    public Result getList(Banner banner, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int size) {
        Result result = ResultUtil.success();
        PageInfo<Banner> bannerList;
        try {
            bannerList = bannerService.getImageList(banner, currentPage, size);
            if (bannerList.getTotal() == 0) {
                return ResultUtil.error(ExceptionEnum.DATA_NOT_FIND);
            }
            Map data = new HashMap(16);
            data.put("imageList", bannerList.getList());
            data.put("total", bannerList.getTotal());
            result.setData(data);
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * @return com.jnshu.carrots.backstageservice.exception.Result
     * @Author 李景磊
     * @Description
     * @Date 2018/10/12 0:00
     * @Param [imageId]
     */
    @ApiOperation(value = "图片详情", notes = "根据id获取图片详情", produces = "application/json")
    @GetMapping(produces = "application/json")
    public Result getImage(long imageId) {
        Result result = ResultUtil.success();
        try {
            Banner banner = bannerService.getImage(imageId);
            if (banner == null) {
                return ResultUtil.error(ExceptionEnum.DATA_NOT_FIND);
            }
            Map data = new HashMap(16);
            data.put("image", banner);
            result.setData(data);
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * @return com.jnshu.carrots.backstageservice.exception.Result
     * @Author 李景磊
     * @Description
     * @Date 2018/10/12 0:01
     * @Param [banner]
     */
    @ApiOperation(value = "新增图片", notes = "增加新的图片", produces = "application/json")
    @PostMapping(produces = "application/json")
    public Result addImage(Banner banner) {
        Result result = ResultUtil.success();
        try {
            boolean info = bannerService.addImage(banner);
            if (info == false) {
                return ResultUtil.error(ExceptionEnum.UPDATE_FAIL);
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

    /**
     * @return com.jnshu.carrots.backstageservice.exception.Result
     * @Author 李景磊
     * @Description
     * @Date 2018/10/12 0:01
     * @Param [banner]
     */
    @ApiOperation(value = "图片信息修改", notes = "根据id修改图片信息", produces = "application/json")
    @PutMapping(produces = "application/json")
    public Result updateImage(Banner banner) {
        Result result = ResultUtil.success();
        try {
            boolean info = bannerService.updateImage(banner);
            if (info == false) {
                return ResultUtil.error(ExceptionEnum.UPDATE_FAIL);
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;

    }

    /**
     * @return com.jnshu.carrots.backstageservice.exception.Result
     * @Author 李景磊
     * @Description
     * @Date 2018/10/12 0:02
     * @Param [imageId]
     */
    @ApiOperation(value = "删除图片", notes = "根据id删除图片", produces = "application/json")
    @DeleteMapping(produces = "application/json")
    public Result deleteImage(long imageId) {
        Result result = ResultUtil.success();
        try {
            boolean info = bannerService.deleteImage(imageId);
            if (info == false) {
                return ResultUtil.error(ExceptionEnum.UPDATE_FAIL);
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

}
