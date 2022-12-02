package com.lihh.dao.impl;

import com.lihh.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(String username) {
        System.out.println("userDaoImpl addUser: " + username);
    }
}
