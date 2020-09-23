package com.zyb.service.impl;

import com.zyb.service.UserService;

import javax.jws.WebService;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/22 11:00
 */
@WebService(targetNamespace = "http://impl.service.zyb.com/")
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(String name, int age) {
        return "新增用户成功--" + name + age;
    }
}
