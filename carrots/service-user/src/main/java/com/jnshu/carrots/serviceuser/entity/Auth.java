package com.jnshu.carrots.serviceuser.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/5 21:20
 * @ModifiedBy：
 */
@Entity
public class Auth implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
