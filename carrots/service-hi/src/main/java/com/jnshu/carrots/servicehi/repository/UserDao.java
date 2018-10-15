package com.jnshu.carrots.servicehi.repository;

import com.jnshu.carrots.servicehi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
