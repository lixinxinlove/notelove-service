package com.lixinxinlove.notelove.service.impl;

import com.lixinxinlove.notelove.dao.UserDOMapper;
import com.lixinxinlove.notelove.dataobject.UserDO;
import com.lixinxinlove.notelove.service.UserService;
import com.lixinxinlove.notelove.utils.RandomUtils;
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

    @Override
    public UserDO register(String phone, String password) {

        UserDO userDO;
        userDO = userDOMapper.selectByPhone(phone);

        if (userDO == null) {
            userDO = new UserDO();
        } else {
            //有用户
            return null;
        }

        userDO.setPhone(phone);
        userDO.setName(phone);
        userDO.setPassword(password);
        userDO.setToken(RandomUtils.getToken());
        userDOMapper.insertSelective(userDO);
        System.out.println(userDO.toString());
        return userDO;
    }
}
