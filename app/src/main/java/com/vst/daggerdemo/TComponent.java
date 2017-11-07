package com.vst.daggerdemo;

import dagger.Component;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */
@Component(dependencies = WComponent.class,modules = TModule.class)
//生命周期为单个页面
@UserScopea
public interface TComponent {
    void inject(SinActivity activity);

    void inject(TActivity activity);
}
