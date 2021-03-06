package com.jnshu.carrots.serviceuser.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jnshu.carrots.serviceuser.client.AuthServiceClient;
import com.jnshu.carrots.serviceuser.entity.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2018/5/24 0024.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Configuration
public class AuthExceptionEntryPoint implements AuthenticationEntryPoint {
    @Autowired
    AuthServiceClient client;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,AuthenticationException authException) throws  ServletException {

        Map map = new HashMap(16);
        map.put("error", "401");
        map.put("message", authException.getMessage());
        map.put("path", request.getServletPath());
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        System.out.println("++++++++++++++++cesi");
        System.out.println(authException.getMessage());
        if (authException.getMessage()!=null){
            String refresh_token= request.getHeader("refresh_token");
            System.out.println(request.getHeader("Authorization"));
            System.out.println(refresh_token);
            JWT jwt = client.refreshToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "refresh_token", refresh_token);
            map.put("jwt",jwt);
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(response.getOutputStream(), map);
        } catch (Exception e) {
            throw new ServletException();
        }
    }
}