package com.kuang.dao.impl;

import com.kuang.dao.UserDao;

/***
 * @description 持久层实现类UserDaoMysqlImpl
 * @author diaoxiuze
 * @date 2020/11/20 14:46
 * @param
 * @return
 */
public class UserDaoMysqlImpl implements UserDao {

    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
