package com.kuang.service;

import com.kuang.dao.impl.UserDaoImpl;

/***
 * @description 业务层接口UserService
 * @author diaoxiuze
 * @date 2020/11/20 13:32
 */
public interface UserService {


    /**
     * 获取用户
     */
    public void getUser1();

    /**
     * 获取mysql
     */
    public void getMysql();

    /**
     * 获取oracle
     */
    public void getOracle();
}
