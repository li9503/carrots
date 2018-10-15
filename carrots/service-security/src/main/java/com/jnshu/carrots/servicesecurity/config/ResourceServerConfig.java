package com.jnshu.carrots.servicesecurity.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    Logger log = LoggerFactory.getLogger(ResourceServerConfig.class);

    @Override
    public void configure(HttpSecurity http) throws Exception {
        System.out.println("cesi-------------------------");
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/css/**", "/index").permitAll()
                .antMatchers("/user/**")
//                .authenticated()
                .hasAnyRole( "ALL")
                .antMatchers("/blogs/**")
//                .authenticated()
                .hasAnyRole("USER", "ALL")
                .and()
                .formLogin().loginPage("/login").failureUrl("/login-error")
                .and()
                .exceptionHandling().accessDeniedPage("/401");
        http.logout().logoutSuccessUrl("/")
        ;

    }


    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.resourceId("blogs").tokenStore(tokenStore);
        resources.resourceId("user").tokenStore(tokenStore);

    }

    @Autowired
    TokenStore tokenStore;


    @Autowired
    JwtAccessTokenConverter tokenConverter;

//    @Autowired
//    UserService userServiceDetail;
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////		auth
////			.inMemoryAuthentication()
////				.withUser("forezp").password("123456").roles("USER")
//// ;
//        //auth.userDetailsService(userDetailsService());
////		auth.userDetailsService(userDetailsService);
//        auth.userDetailsService(userServiceDetail).passwordEncoder(new BCryptPasswordEncoder());
//        System.out.println("登录验证");
//        log.info("登陆验证");
//    }
}
