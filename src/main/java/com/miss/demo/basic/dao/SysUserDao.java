package com.miss.demo.basic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miss.demo.basic.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao extends BaseMapper<SysUser> {
    void insertSysUser(SysUser sysUser);
}
