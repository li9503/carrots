//
//package com.jnshu.carrots.servicesecurity.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@EnableWebSecurity
//@Configuration
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	// @formatter:off
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//				.authorizeRequests()
//				.antMatchers("/css/**", "/index").permitAll()
//				.antMatchers("/user/**").hasAnyRole("USER", "ALL")
//				.antMatchers("/blogs/**").hasAnyRole("USER", "ALL")
//				.and()
//				.formLogin().loginPage("/login").failureUrl("/login-error")
//				.and()
//				.exceptionHandling().accessDeniedPage("/401");
//		http.logout().logoutSuccessUrl("/");
//	}
//	// @formatter:on
//
//	// @formatter:off
//	@Autowired
//	UserDetailsService userDetailsService;
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////		auth
////			.inMemoryAuthentication()
////				.withUser("forezp").password("123456").roles("USER")
//// ;
//		//auth.userDetailsService(userDetailsService());
////		auth.userDetailsService(userDetailsService);
//		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//	}
//}
