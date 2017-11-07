package com.vst.daggerdemo;

import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/10/31.
 * email:16681805@qq.com
 */
@Module
public class ApplicationModule {
    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.application;
    }

    @Provides
    @Singleton
    public ExecutorService provideExecutor() {
        return Executors.newFixedThreadPool(5);
    }
}
