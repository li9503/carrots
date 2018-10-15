package com.jnshu.carrots.servicesecurity.dao;


import com.jnshu.carrots.servicesecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
