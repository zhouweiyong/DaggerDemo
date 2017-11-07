package com.vst.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */
@Module
public class TModule {
    @Provides
    Address provideAddress() {
        Address a = new Address();
        a.setProvince("广东");
        a.setCity("深圳");
        return a;
    }


}
