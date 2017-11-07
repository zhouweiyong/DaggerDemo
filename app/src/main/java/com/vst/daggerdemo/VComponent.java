package com.vst.daggerdemo;

import dagger.Component;

/**
 * Created by zwy on 2017/10/31.
 * email:16681805@qq.com
 */
@Component(modules = VModule.class)
public interface VComponent {
    User user();
}
