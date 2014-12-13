package com.yhq.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yhq.pojo.User;
import com.yhq.service.IUserService;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 插入数据
     * 
     * @param User
     */
    /**
     * 使用：@ResponseBody 标注方法， 该方法返回 Java对象（支持复杂对象），
     * MappingJacksonHttpMessageConverter 会将对象转换为 JSON 输出
     * 
     */
    @ResponseBody
    @RequestMapping(value = "insertUser.json")
    public Map<String, Object> insertUser(User user) {
	Map<String, Object> map = new HashMap<String, Object>();
	this.userService.insert(user);
	map.put("name", user.getName());
	return map;
    }

    @ResponseBody
    @RequestMapping(value = "val.json")
    public Map<String, Object> validataUser(String userName) {
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("code", true);
	map.put("name", userName);
	return map;
    }
}
