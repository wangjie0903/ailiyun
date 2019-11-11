package com.jk.service;

import com.jk.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceFeignImpl implements UserServiceFeign {

    @Resource
    private UserMapper userMapper;
}
