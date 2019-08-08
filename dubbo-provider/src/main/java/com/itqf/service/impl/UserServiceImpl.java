package com.itqf.service.impl;

import com.itqf.pojo.User;
import com.itqf.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liutong
 * @date: 2019-07-26 16:50
 */
public class UserServiceImpl implements UserService {
    public List<User> findAll() {
        List users = new ArrayList();
        for (int i = 0; i < 5; i++) {
            User user = new User(i+1,"小明"+(i+1),"jbgsn");
            users.add(user);
        }
        return users;
    }
}
