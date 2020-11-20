package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

/***
 * @description 业务层实现类UserServiceImpl
 * @author diaoxiuze
 * @date 2020/11/20 13:36
 * @param
 * @return
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public void getUser() {

        userDao.getUser();
    }
}
