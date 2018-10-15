package com.jnshu.carrots.serviceuaa.service;


import com.jnshu.carrots.serviceuaa.dao.RoleDao;
import com.jnshu.carrots.serviceuaa.dao.UserDao;
import com.jnshu.carrots.serviceuaa.entity.Role;
import com.jnshu.carrots.serviceuaa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by fangzhipeng on 2017/5/10.
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDao userRepository;
    @Autowired
    private RoleDao roleRepository;
    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("---------------"+username);
        User user = userRepository.findByUsername(username);
//        User user=new User();
//
//
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
        System.out.println("++++++++++++++++++++++++++");
        return user;

    }

}
