package com.vst.daggerdemo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */
@Module
public class WModule {
    @Provides
    @Singleton
    public User provideUser() {
        return new User("haima", 100);
    }
}
