package com.example.focus3.Presenter;

import android.util.Log;

import com.example.focus3.Dao.User;
import com.example.focus3.Model.RegAndLoginModImp;
import com.example.focus3.Model.RegAndLoginModel;
import com.example.focus3.View.RegiserAndLoginView;

public class RegiAndLoginPre<T extends RegiserAndLoginView> {
    //new 注册登录
    RegAndLoginModImp registerModImp=new RegAndLoginModImp();
    //view不需要new被activity继承
    RegiserAndLoginView regiserAndLoginView;

    public RegiAndLoginPre(T regiserView)
    {
        this.regiserAndLoginView =regiserView;
    }
    public void registerDo(){
        if(registerModImp!=null) {
            //获取view的user对象
            User user= regiserAndLoginView.showRegister();
            Log.e("111111",user.getUser_name());
           //model处理user对象
            Boolean a=registerModImp.loadRegister(user);
            Log.d("9999999", a.toString());
        }
        else {
            Log.e("111111","failed");
        }
    }
    public void loginDo(){
       if(registerModImp!=null)
       {
           User user= regiserAndLoginView.showLogin();
           registerModImp.loadLogin(user.getUser_email(),user.getUser_password());
           Log.e("1111113", registerModImp.getuserid());
       }
    }

}
