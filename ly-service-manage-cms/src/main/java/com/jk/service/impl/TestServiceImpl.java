package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.pojo.User;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User Hi() {
        return userMapper.selectAll();
    }
}
