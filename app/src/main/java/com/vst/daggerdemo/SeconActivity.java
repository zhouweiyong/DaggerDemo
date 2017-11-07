package com.vst.daggerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

/**
 * Created by zwy on 2017/10/31.
 * email:16681805@qq.com
 */

public class SeconActivity extends Activity implements IMainView {
    @Inject
    public User user;
    @Inject
    public Fruit fruit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VComponent vComponent = DaggerVComponent.builder().build();
        DaggerMainComponent.builder().vComponent(vComponent).mainModule(new MainModule(this)).build().inject(this);
    }

    public void onClick(View view) {
        Log.i("zwy", user + " " + user.getName() + " " + user.getAge());
        Log.i("zwy", fruit + " " + fruit.getName() + " " + fruit.getColor());
    }

    @Override
    public void updataUI(String str) {

    }
}
