package com.jnshu.carrots.serviceadmin.controller;

import com.jnshu.carrots.serviceadmin.dao.Article;
import com.jnshu.carrots.serviceadmin.dao.Info;
import com.jnshu.carrots.serviceadmin.util.ImageTypeChange;
import com.jnshu.carrots.serviceadmin.util.Return;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.util.*;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/9/27 16:21
 * @Param
 * @return
 */
@RequestMapping("/a/u/image")
@RestController
public class ArticleController {
    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [timeFirst, timeLast, imageType, imageStatus, currentPage, size]
     */
    @ApiOperation(value = "获取图片列表", notes = "获取所有图片列表，首行返回搜索条件", produces = "application/json")
    @GetMapping("/list")
    public Info imageList(@RequestParam(defaultValue = "106464684")long timeFirst,@RequestParam(defaultValue = "68464646") long timeLast, @RequestParam(defaultValue = "0") int imageType, @RequestParam(defaultValue = "0") int imageStatus, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10") int size) {
        Info info = new Info();
        Map data = new HashMap(16);
        List list = new ArrayList();
        Article re = new Article("测试", imageType, timeFirst, timeLast, imageStatus);
        int total = 1000;
        for (int i = (currentPage - 1) * size + 1; i <= currentPage * size; i++) {
            Article article = new Article(i);
            list.add(article);
        }
        list.set(0, re);
        data.put("total", total);
        data.put("imageList", list);
        info.setCode(0000);
        info.setMessage("success");
        info.setData(data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [imageName, imageTime, imageType, imageCaption, imageJumpUrl, imageTrade, imageUrl, imageStatus]
     */
    @ApiOperation(value = "新增图片", notes = "增加新的图片", produces = "application/json")
    @PostMapping
    public Info add(String imageName, int imageTime, int imageType, String imageCaption, String imageJumpUrl, int imageTrade, String imageUrl, int imageStatus) {
        Map data = new HashMap(16);
        Article article = new Article(imageName, imageTime, imageType, imageCaption, imageJumpUrl, imageTrade, imageUrl, imageStatus);
        data.put("article", article);
        Info info = Return.getInfo(article, data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [imageId]
     */
    @ApiOperation(value = "图片详情", notes = "根据id获取图片详情", produces = "application/json")
    @GetMapping
    public Info get(int imageId) {
        Map data = new HashMap(16);
        Article article = new Article(imageId);
        data.put("image", article);
        Info info = Return.getInfo(article, data);
        return info;
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [imageName, imageTime, imageType, imageCaption, imageJumpUrl, imageTrade, imageUrl, imageStatus]
     */
    @ApiOperation(value = "图片信息修改", notes = "根据id修改图片信息", produces = "application/json")
    @PutMapping
    public Info update(String imageName, int imageTime, int imageType, String imageCaption, String imageJumpUrl, int imageTrade, String imageUrl, int imageStatus) {
        return add(imageName, imageTime, imageType, imageCaption, imageJumpUrl, imageTrade, imageUrl, imageStatus);
    }
    
    /**
     *
     * @Author 李景磊
     * @Description 
     * @Date 2018/10/11 20:40 
     * @Param [imageId, imageStatus]
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     */
    @ApiOperation(value = "修改上线状态", notes = "根据id修改图片上线状态", produces = "application/json")
    @PutMapping(value = "/status")
    public Info status(int imageId, int imageStatus,int imageTrade) {
        Info info = Return.getInfo(imageId + imageStatus + ""+imageTrade);
        return info;
    }
    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [imageId]
     */
    @ApiOperation(value = "删除图片", notes = "根据id删除图片", produces = "application/json")
    @DeleteMapping
    public Info delete(int imageId) {
        return get(imageId);
    }

    /**
     * @return com.jnshu.carrots.serviceadmin.dao.Info
     * @Author 李景磊
     * @Description
     * @Date 2018/9/28 1:29
     * @Param [file, request]
     */
    @ApiOperation(value = "上传图片", notes = "上传图片，返回Url", produces = "application/json")
    @PostMapping(value = "/photoUpload")
    public Info photoUpload(MultipartFile file, HttpServletRequest request) throws IllegalStateException, IOException {
        String message = new String();
        Map data = new HashMap(16);
        int code = 0;
        // 判断上传的文件是否为空
        if (file != null) {
            String path;// 文件路径
            String type;// 文件类型
            // 文件原名称
            String fileName = file.getOriginalFilename();
            System.out.println("上传的文件原名称:" + fileName);
            // 判断文件类型
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            // 判断文件类型是否为空
            if (type != null) {
                if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase()) || "JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
//                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    String realPath = "/media/image/";
                    // 自定义的文件名称
                    type = "png";
                    String trueFileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + type;
                    // 设置存放图片文件的路径
                    path = realPath + trueFileName;
                    System.out.println("存放图片文件的路径:" + path);
                    ImageTypeChange.base64StringToImage(path, file);
                    data.put("imageName",trueFileName);
                    data.put("imageUrl", "http://193.112.201.68/" + trueFileName);
                    code = 0000;
                } else {
                    message = "不是我们想要的文件类型,请按要求重新上传";
                    code = 1000;

                }
            } else {
                message = "文件类型为空";
                code = 1001;
            }
        } else {
            message = "没有找到相对应的文件";
            code = 2000;
        }
        Info info = new Info();
        info.setCode(code);
        info.setMessage(message);
        info.setData(data);
        return info;
    }


}
