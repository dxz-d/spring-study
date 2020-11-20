package com.kuang.service;

import org.junit.Test;

/***
 * @description 业务层UserService测试
 * @author diaoxiuze
 * @date 2020/11/20 13:40
 * @param
 * @return
 */
public class UserServiceTest {

    @Test
    public void getUser() {

        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
