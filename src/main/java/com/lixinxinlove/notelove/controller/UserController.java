package com.lixinxinlove.notelove.controller;

import com.lixinxinlove.notelove.dataobject.UserDO;
import com.lixinxinlove.notelove.response.CommonReturnType;
import com.lixinxinlove.notelove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户相关的操作
 */

@RequestMapping("user")
@RestController
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")   //跨域请求
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public CommonReturnType login(@RequestParam(name = "phone") String phone, @RequestParam(name = "password") String password) {

        UserDO userDO = userService.login(phone, password);

        if (userDO != null) {
            System.out.println(userDO.toString());
        } else {
            System.out.println("没有用户");
        }

        if (userDO != null) {
            return CommonReturnType.create(userDO);
        } else {
            return CommonReturnType.error(null);
        }
    }


    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public CommonReturnType register(@RequestParam(name = "phone") String phone, @RequestParam(name = "password") String password) {

        UserDO userDO = userService.register(phone, password);

        if (userDO != null) {
            System.out.println(userDO.toString());
        } else {
            System.out.println("没有用户");
        }

        if (userDO != null) {
            //新用户
            return CommonReturnType.create(userDO);
        } else {
            //用户已经重在
            return CommonReturnType.error("有该用户");
        }
    }
}
