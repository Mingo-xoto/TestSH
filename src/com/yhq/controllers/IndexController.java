package com.yhq.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private String PATH = "/";

    @RequestMapping("/test")
    public String index(ModelMap map) {
	System.out.println("index...");
	return PATH + "index";
    }
}
