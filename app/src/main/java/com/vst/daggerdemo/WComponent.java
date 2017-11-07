package com.vst.daggerdemo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */
@Component(modules = WModule.class)
@Singleton
public interface WComponent {
    User provideUser();
}
