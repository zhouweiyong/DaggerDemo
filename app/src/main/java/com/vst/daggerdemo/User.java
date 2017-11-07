package com.vst.daggerdemo;

import javax.inject.Inject;

/**
 * Created by zwy on 2017/10/27.
 * email:16681805@qq.com
 */
public class User {
    public User() {
    }
    @Inject
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
