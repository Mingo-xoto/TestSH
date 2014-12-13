package com.yhq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.ModelMap;

import com.yhq.pojo.User;
import com.yhq.service.IUserService;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("insertUser.json")
    public void insertUser(User user, ModelMap map) {
	System.out.println(user.getName());
	this.userService.insert(user);
    }
}
