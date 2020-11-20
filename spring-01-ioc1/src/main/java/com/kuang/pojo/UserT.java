package com.kuang.pojo;

/***
 * @description 实体类UserT
 * @author diaoxiuze
 * @date 2020/11/20 19:42
 */
public class UserT {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("nameT:" + name);
    }
}
