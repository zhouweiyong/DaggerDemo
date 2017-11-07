package com.vst.daggerdemo;

import dagger.Component;

/**
 * Created by zwy on 2017/10/27.
 * email:16681805@qq.com
 */
@Component(dependencies = VComponent.class,modules = {MainModule.class})
public interface MainComponent {
//    MainActivity injecttt(MainActivity activity);
    void injecttt(MainActivity activity);
    void inject(SeconActivity activity);
}
//Error:(12, 11) 错误: Members injection methods may only return the injected type or void.