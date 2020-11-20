package com.kuang.service.impl;

import com.kuang.dao.UserDao;
import com.kuang.dao.impl.UserDaoImpl;
import com.kuang.dao.impl.UserDaoMysqlImpl;
import com.kuang.dao.impl.UserDaoOracleImpl;
import com.kuang.service.UserService;

/***
 * @description 业务层实现类UserServiceImpl
 * @author diaoxiuze
 * @date 2020/11/20 13:36
 * @param
 * @return
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao1 = new UserDaoImpl();
    private UserDao userDaoMysql = new UserDaoMysqlImpl();
    private UserDao userDaoOracle = new UserDaoOracleImpl();

    private UserDao userDao;

    /**
     * 利用set进行动态实现值的注入
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }

    public void getUser1() {
        userDao1.getUser();
    }

    public void getMysql() {
        userDaoMysql.getUser();
    }

    public void getOracle() {
        userDaoOracle.getUser();
    }
}
