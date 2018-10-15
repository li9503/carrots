package com.jnshu.carrots.servicesecurity.client.hystrix;


import com.jnshu.carrots.servicesecurity.client.AuthServiceClient;
import com.jnshu.carrots.servicesecurity.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
