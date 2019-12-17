package com.example.focus3.Model;

import android.content.Context;

import com.example.focus3.Dao.User;

public interface RegAndLoginModel {

    //注册  返回bool
    Boolean loadRegister(User user);
    //登录  返回登录的id
    String loadLogin(String id, String pass);
    //内部接口
    interface onLogin{
        User complete(User user);

    }
}
