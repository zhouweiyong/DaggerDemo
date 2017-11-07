package com.vst.daggerdemo;

import android.content.Context;

import java.util.concurrent.ExecutorService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zwy on 2017/10/31.
 * email:16681805@qq.com
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context context();

    ExecutorService executor();
}
