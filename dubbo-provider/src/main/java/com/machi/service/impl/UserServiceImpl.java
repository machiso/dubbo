package com.machi.service.impl;

import com.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    public String getName(String userId) {
        return "Anta"+userId;
    }
}
