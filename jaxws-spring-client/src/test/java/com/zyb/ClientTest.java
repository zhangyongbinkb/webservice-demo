package com.zyb;

import com.zyb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/23 08:42
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class ClientTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService() {
        //查看接口代理对象类型
        System.out.println(userService.getClass());

        //远程访问服务端方法
        System.out.println(userService.addUser("wangwu", 99));
    }
}
