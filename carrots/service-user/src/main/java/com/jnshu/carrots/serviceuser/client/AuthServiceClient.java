package com.jnshu.carrots.serviceuser.client;


import com.jnshu.carrots.serviceuser.client.hystrix.AuthServiceHystrix;
import com.jnshu.carrots.serviceuser.entity.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fangzhipeng on 2017/5/27.
 */

@FeignClient(value = "service-uaa",fallback =AuthServiceHystrix.class )
public interface AuthServiceClient {

    @PostMapping(value = "/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("username") String username, @RequestParam("password") String password);
    @PostMapping(value = "/oauth/token")
    JWT refreshToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("refresh_token") String refresh_token);
}



