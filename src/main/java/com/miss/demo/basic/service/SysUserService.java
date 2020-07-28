package com.miss.demo.basic.service;

import com.miss.demo.basic.entity.SysUser;
import org.springframework.stereotype.Service;

@Service
public interface SysUserService {
    SysUser getSysUser(String id);

    void insert(SysUser sysUser);
}
