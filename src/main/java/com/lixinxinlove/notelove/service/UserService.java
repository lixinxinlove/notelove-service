package com.lixinxinlove.notelove.service;


import com.lixinxinlove.notelove.dataobject.UserDO;
import org.springframework.stereotype.Service;

/**
 * 用户操作返回数据
 */


public interface UserService {

    UserDO login(String phone, String password);

}
