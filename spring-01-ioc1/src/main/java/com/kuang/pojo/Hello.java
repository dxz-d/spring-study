package com.kuang.pojo;

/***
 * @description 实体类Hello
 * @author diaoxiuze
 * @date 2020/11/20 16:30
 */
public class Hello {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hello(String name) {
        this.name = name;
    }

    public Hello() {

    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show() {
        System.out.println("Hello," + name);
    }
}
