package com.example.focus3;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        //后端appkey
        Bmob.initialize(this, "9c68331f1d2390aa413dfd8a5a5ad771");
    }
    //登录启动
    public void login(View view) {
        Intent loginInt = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(loginInt);
    }
   //注册启动
    public void register(View view) {
        Intent registerInt = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(registerInt);
    }

    public void set_time(View view) {
        startActivity(new Intent(MainActivity.this,SetTimeActivity.class));
    }

}



