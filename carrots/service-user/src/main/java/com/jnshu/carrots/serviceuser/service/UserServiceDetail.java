package com.jnshu.carrots.serviceuser.service;


import com.jnshu.carrots.serviceuser.client.AuthServiceClient;
import com.jnshu.carrots.serviceuser.dao.RoleDao;
import com.jnshu.carrots.serviceuser.dao.UserDao;
import com.jnshu.carrots.serviceuser.dto.UserLoginDTO;
import com.jnshu.carrots.serviceuser.entity.JWT;
import com.jnshu.carrots.serviceuser.entity.Role;
import com.jnshu.carrots.serviceuser.entity.User;
import com.jnshu.carrots.serviceuser.exception.UserLoginException;
import com.jnshu.carrots.serviceuser.utils.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * Created by fangzhipeng on 2017/5/10.
 */
@Service
public class
  UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDao userRepository;
    @Autowired
    private RoleDao roleRepository;
    @Autowired
    AuthServiceClient client;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("++++++++++++++++++++++++++hhhh");
        return userRepository.findByUsername(username);
    }

    public User insertUser(String username,String  password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(BPwdEncoderUtil.BCryptPassword(password));
        return userRepository.save(user);
    }

    public UserLoginDTO login(String username,String password){
        System.out.println("------------------标记3------------");
        User user = userRepository.findByUsername(username);

//User user = new User();
        Collection<? extends GrantedAuthority> roleList= user.getAuthorities();
        Map roleMap = new HashMap(16);
        List<Role> roles= new ArrayList<>();
        for (GrantedAuthority authority : roleList) {
            String role= authority.getAuthority();
            Collection<? extends GrantedAuthority> authList= roleRepository.findByName(role).getAuthorities();
            roleMap.put(role,authList);
            roles.addAll((Collection<? extends Role>) authList);
            System.out.println("-------------------"+authList.size());
        }
        user.setAuthorities(roles);
        user.setRole(roleMap);
        System.out.println(user);
        System.out.println(roles.size());

        System.out.println("------------------标记1------------");
        if (null == user) {
            throw new UserLoginException("error username");
        }
        if (!BPwdEncoderUtil.matches(password, user.getPassword())) {
            throw new UserLoginException("error password");
        }
        // 获取token
        JWT jwt = client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        // 获得用户菜单
        if (jwt == null) {
            throw new UserLoginException("error internal");
        }
        UserLoginDTO userLoginDTO = new UserLoginDTO();
        userLoginDTO.setJwt(jwt);
        userLoginDTO.setUser(user);
        return userLoginDTO;
    }
}
