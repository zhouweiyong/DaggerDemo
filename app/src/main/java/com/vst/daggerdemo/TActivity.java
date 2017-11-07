package com.vst.daggerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

/**
 * Created by zwy on 2017/11/1.
 * email:16681805@qq.com
 */

public class TActivity extends Activity {

    @Inject
    Address address;
    @Inject
    Address address2;
    @Inject
    User user;
    @Inject
    User user2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);
        DaggerTComponent.builder().build().inject(this);
    }

    public void onClick(View view) {
        Log.i("zwy", "" + address);
        Log.i("zwy", "" + address2);
        Log.i("zwy", user + ">>>" + user.getName() + "  " + user.getAge());
        Log.i("zwy", user2 + ">>>" + user2.getName() + "  " + user2.getAge());
    }
}
