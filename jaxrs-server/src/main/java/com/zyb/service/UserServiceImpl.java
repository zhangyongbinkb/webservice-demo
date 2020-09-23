package com.zyb.service;

import com.zyb.entity.User;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/23 10:46
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user:" + user);
    }

    @Override
    public User finUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("张飞");
        user.setCity("三国");
        return user;
    }
}
