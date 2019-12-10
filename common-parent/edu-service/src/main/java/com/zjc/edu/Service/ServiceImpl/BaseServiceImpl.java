package com.zjc.edu.Service.ServiceImpl;

import com.zjc.edu.Service.BaseService;
import com.zjc.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    /**
     *    统一管理DAO
     */
    @Autowired
    private UserMapper userMapper;
}
