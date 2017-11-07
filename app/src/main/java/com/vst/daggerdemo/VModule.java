package com.vst.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/10/31.
 * email:16681805@qq.com
 */
@Module
public class VModule {

    @Provides
    User provideUser() {
        return new User("tom", 36);
    }

}
