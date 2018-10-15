package com.jnshu.carrots.backstageservice.service;


//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jnshu.carrots.backstageservice.exception.Result;
import com.jnshu.carrots.backstageservice.model.User;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/9 10:42
 * @ModifiedBy：
 */
public interface UserService {

//    UserDetails loadUserByUsername(String var1) throws UsernameNotFoundException;

    Result loadUserByUsername(String userName, String userPassword);
}
