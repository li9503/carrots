package com.jnshu.carrots.serviceuser.dao;


import com.jnshu.carrots.serviceuser.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/5 22:56
 * @ModifiedBy：
 */
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
