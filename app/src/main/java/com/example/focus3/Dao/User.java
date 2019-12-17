package com.example.focus3.Dao;

import cn.bmob.v3.BmobObject;


public class User extends BmobObject {
    String user_name=null;
    String user_tel=null;
    String user_email=null;
    String user_password=null;
    int user_score=0;
    String achieve=null;

    public String getAchieve() {
        return achieve;
    }

    public void setAchieve(String achieve) {
        this.achieve = achieve;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String name) {
        this.user_name = name;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String tel) {
        this.user_tel = tel;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String email) {
        this.user_email = email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String password) {
        this.user_password = password;
    }

    public int getUser_score() {
        return user_score;
    }

    public void setUser_score(int score) {
        this.user_score = score;
    }

}
