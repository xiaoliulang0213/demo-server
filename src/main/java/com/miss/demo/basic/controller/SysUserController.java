package com.miss.demo.basic.controller;

import com.miss.demo.basic.entity.SysUser;
import com.miss.demo.basic.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/basic/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserServiceImpl;

    @RequestMapping(value = "/getSysUser", method = RequestMethod.GET)
    public SysUser getSysUser(@RequestParam String id){
        return sysUserServiceImpl.getSysUser(id);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insertSysUser(@RequestBody SysUser sysUser){
        sysUserServiceImpl.insert(sysUser);
    }
}
