package com.vst.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IMainView {
    @Inject
    User user;
    @Inject
    User user2;
    @Inject
    Fruit fruit;
    @Inject
    Fruit fruit2;
    @Inject
    MainPresenter mainP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VComponent vComponent = DaggerVComponent.builder().build();
        DaggerMainComponent.builder().vComponent(vComponent)
                .mainModule(new MainModule(this))
                .build()
                .injecttt(this);

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SeconActivity.class));
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SinActivity.class));
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TActivity.class));
            }
        });
    }

    public void onClick(View view) {
        Log.i("zwy", user + " " + user.getName() + " " + user.getAge());
        Log.i("zwy", fruit + " " + fruit.getName() + " " + fruit.getColor());
        Log.i("zwy", "" + user);
        Log.i("zwy", "" + user2);
        mainP.loadData();
    }

    @Override
    public void updataUI(String str) {
        Log.i("zwy", str);
    }
}
