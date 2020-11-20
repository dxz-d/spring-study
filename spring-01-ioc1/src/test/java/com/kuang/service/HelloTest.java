package com.kuang.service;

import com.kuang.pojo.Hello;
import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @description 测试类HelloTest
 * @author diaoxiuze
 * @date 2020/11/20 19:13
 * @param
 * @return
 */
public class HelloTest {

    //解析beans.xml文件 , 生成管理相应的Bean对象
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void test() {

        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void testBeanRef() {

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        userServiceImpl.getUser();

    }

}
