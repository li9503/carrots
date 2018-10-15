package com.jnshu.carrots.serviceuser.client.hystrix;


import com.jnshu.carrots.serviceuser.client.AuthServiceClient;
import com.jnshu.carrots.serviceuser.entity.JWT;
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

    @Override
    public JWT refreshToken(String authorization, String type, String refresh_token) {
        return null;
    }
}
