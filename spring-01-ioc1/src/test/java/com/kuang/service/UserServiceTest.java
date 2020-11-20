package com.kuang.service;

import com.kuang.dao.impl.UserDaoImpl;
import com.kuang.dao.impl.UserDaoMysqlImpl;
import com.kuang.dao.impl.UserDaoSqlServiceImpl;
import com.kuang.pojo.Hello;
import com.kuang.pojo.User;
import com.kuang.service.impl.UserServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        userService.getUser1();
        userService.getMysql();
        userService.getOracle();
    }

    /**
     * set简化
     */
    @Test
    public void setSimplify() {
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        ((UserServiceImpl) userService).getUser();

        System.out.println("=================");
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
        ((UserServiceImpl) userService).getUser();

        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServiceImpl());
        ((UserServiceImpl) userService).getUser();
    }

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

    /**
     * ioc无参构造
     */
    @Test
    public void iocNoArgument() {

        // 在执行getBean()时，user已经创建好了，通过无参构造
        User user = (User) applicationContext.getBean("user");
        // 调用对象方法
        user.show();
    }
}
