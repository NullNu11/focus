package com.example.focus3.Dao;

import java.util.Date;

import cn.bmob.v3.BmobObject;

public class History extends BmobObject {
    String user_id;
    Date time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}

