package com.miss.demo.basic.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.miss.demo.basic.dao.SysUserDao;
import com.miss.demo.basic.entity.SysUser;
import com.miss.demo.basic.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    /**
    *@description 根据Id查询用户
    *@author chengpunan
    *@methodParam [id]
    *@return com.miss.demo.basic.entity.SysUser
    *@date 2020/7/24 16:28
    **/
    public SysUser getSysUser(String id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", id);
        SysUser sysUser = sysUserDao.selectOne(queryWrapper);
        return sysUser;
    }

    /**
    *@description 插入用户
    *@author chengpunan
    *@methodParam [sysUser]
    *@return void
    *@date 2020/7/24 16:55
    **/
    public void insert(SysUser sysUser) {
        sysUserDao.insertSysUser(sysUser);
    }
}
