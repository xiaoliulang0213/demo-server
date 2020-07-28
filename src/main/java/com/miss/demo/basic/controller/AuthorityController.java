package com.miss.demo.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/basic/authority")
public class AuthorityController {

    @RequestMapping(value = "/test")
    public String test(){
        return "测试接口!";
    }
}
