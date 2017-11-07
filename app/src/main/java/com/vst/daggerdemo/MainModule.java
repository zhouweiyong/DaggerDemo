package com.vst.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/10/27.
 * email:16681805@qq.com
 */
@Module
public class MainModule {
    private IMainView mainView;

    public MainModule(IMainView mainView) {
        this.mainView = mainView;
    }


    @Provides
    Fruit provideFruit() {
        return new Fruit("apple", "yellow");
    }

    @Provides
    MainPresenter providePresenter() {
        return new MainPresenter(mainView);
    }
}
