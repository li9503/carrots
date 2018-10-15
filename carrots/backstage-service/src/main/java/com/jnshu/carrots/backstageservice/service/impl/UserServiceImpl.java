package com.jnshu.carrots.backstageservice.service.impl;

import com.jnshu.carrots.backstageservice.dao.UserMapper;
import com.jnshu.carrots.backstageservice.exception.ExceptionEnum;
import com.jnshu.carrots.backstageservice.exception.ExceptionHandle;
import com.jnshu.carrots.backstageservice.exception.Result;
import com.jnshu.carrots.backstageservice.model.User;
import com.jnshu.carrots.backstageservice.service.UserService;
import com.jnshu.carrots.backstageservice.util.MD5Util;
import com.jnshu.carrots.backstageservice.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/12 9:35
 * @ModifiedBy：
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ExceptionHandle exceptionHandle;

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserDetails userDetails = userMapper.selectByName(s);
//        return userDetails;
//    }


    @Override
    public Result loadUserByUsername(String userName, String userPassword) {
        Result result = ResultUtil.success();
        try {
            User user = userMapper.selectByName(userName);
            if (user == null){
                return ResultUtil.error(ExceptionEnum.USER_NOT_FIND);
            }
            result.setData(user);
            if (MD5Util.verify(userPassword, user.getUserSalt(), user.getUserPassword()) == false) {
                return ResultUtil.error(ExceptionEnum.PSW_ERROR);
            }
        } catch (Exception e) {
            result = exceptionHandle.exceptionGet(e);
        }
        return result;
    }

}
