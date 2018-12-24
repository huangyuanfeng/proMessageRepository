package com.sino.demo.service.impl;

import com.sino.demo.entity.User;
import com.sino.demo.mapper.UserMapper;
import com.sino.demo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class HelloServiceImpl implements HelloService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User helloWorld(String id)
    {
        User user = userMapper.queryUsersById(id);
        log.info("queryUserInfo success, user {}", user);

        return user;
    }
}
