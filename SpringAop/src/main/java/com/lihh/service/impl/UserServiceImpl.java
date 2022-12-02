package com.lihh.service.impl;

import com.lihh.dao.UserDao;
import com.lihh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser() {
        System.out.println("addUser UserServiceImpl");
        userDao.addUser("lihh");
        return 0;
    }
}
