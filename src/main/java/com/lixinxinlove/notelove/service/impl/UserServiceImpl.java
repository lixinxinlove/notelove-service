package com.lixinxinlove.notelove.service.impl;

import com.lixinxinlove.notelove.dao.UserDOMapper;
import com.lixinxinlove.notelove.dataobject.UserDO;
import com.lixinxinlove.notelove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDOMapper userDOMapper;


    @Override
    public UserDO login(String phone, String password) {
        return userDOMapper.login(phone, password);
    }
}
