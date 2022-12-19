package com.lihh.service.impl;

import com.lihh.mapper.UserMapper;
import com.lihh.pojo.Account;
import com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Account> allUser() {
        return userMapper.allUser();
    }
}
