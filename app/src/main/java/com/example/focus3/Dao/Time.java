package com.example.focus3.Dao;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

public class Time extends BmobObject {
    String user_id;
    BmobDate set_rel_time;
    BmobDate set_abs_time;
    BmobDate curr_time;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setCurr_time(BmobDate curr_time) {
        this.curr_time = curr_time;
    }

    public BmobDate getCurr_time() {
        return curr_time;
    }

    public BmobDate getSet_abs_time() {
        return set_abs_time;
    }

    public void setSet_abs_time(BmobDate set_abs_time) {
        this.set_abs_time = set_abs_time;
    }

    public BmobDate getSet_rel_time() {
        return set_rel_time;
    }

    public void setSet_rel_time(BmobDate set_rel_time) {
        this.set_rel_time = set_rel_time;
    }
    //         String a="20180221124813";
//         SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
//         Date date=null;
//         try{
//         date=simpleDateFormat.parse(a);
//         }catch(ParseException ex){
//         ex.printStackTrace();
//         }
//         BmobDate da=new BmobDate(date);
//         list.iterator().next().setSet_abs_time(da);
}
