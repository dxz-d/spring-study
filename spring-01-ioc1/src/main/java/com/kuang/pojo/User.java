package com.kuang.pojo;

/***
 * @description 实体类User
 * @author diaoxiuze
 * @date 2020/11/20 19:28
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User的无参构造方法");
    }

    public void show() {
        System.out.println("name:" + name);
    }
}
