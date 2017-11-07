package com.vst.daggerdemo;

/**
 * Created by zwy on 2017/10/30.
 * email:16681805@qq.com
 */

public class MainPresenter {
    private IMainView mIView;

    public MainPresenter(IMainView mIView) {
        this.mIView = mIView;
    }

    public void loadData() {
        mIView.updataUI("HEllol.....");
    }
}
