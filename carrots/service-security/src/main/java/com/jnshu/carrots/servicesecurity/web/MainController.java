/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jnshu.carrots.servicesecurity.web;

import com.jnshu.carrots.servicesecurity.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by fangzhipeng on 2017/5/15.
 */
@Controller
public class MainController {
        @Autowired
        UserService userServiceDetail;
	@RequestMapping("/")
	public String root() {
		return "redirect:/index";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/user/index")
	public String userIndex() {
		return "user/index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username , @RequestParam("password") String password, Model model){
//        //参数判断，省略
//        userServiceDetail.login(username,password);
//        model.addAttribute("loginError", false);
//        return "login";
//    }
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
	@GetMapping("/401")
	public String accesssDenied() {
		return "401";
	}


}
