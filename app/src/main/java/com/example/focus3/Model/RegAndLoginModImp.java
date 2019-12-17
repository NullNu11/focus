package com.example.focus3.Model;

import android.util.Log;

import com.example.focus3.Dao.User;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

public class RegAndLoginModImp implements RegAndLoginModel {

   public String userId = null;
   public  Boolean isRegister=false;

    public void setisRegister(Boolean register) {
        isRegister = register;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //注册实现
    @Override
    public Boolean loadRegister(User user) {
        user.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e != null) {
                    int a=1;
                    isRegister=true;
                    Log.e("成功", "11111");
                } else
                    Log.e("111111111", "shibai");
            }
        });
        return true;
    }
    //登录实现
    @Override
    public String loadLogin(final String id, final String pass) {
        BmobQuery<User> cate = new BmobQuery<>();
        cate.addWhereEqualTo("user_email", id);
        cate.findObjects(new FindListener<User>() {
            @Override
            public void done(List<User> list, BmobException e) {
                if (e == null) {
                    if (list.listIterator().next().getUser_password().equals(pass)) {
                        Log.d("11111111", "done: 登录成功");
                        setUserId(id);
                        Log.d("11111suc", list.listIterator().next().getUser_name());
                    } else {
                        Log.d("11111111", "done: 密码错误");
                    }
                } else {
                    //邮箱登录失败
                    //电话登录
                    BmobQuery<User> cate = new BmobQuery<>();
                    cate.addWhereEqualTo("user_tel", id);
                    cate.findObjects(new FindListener<User>() {
                        @Override
                        public void done(List<User> list, BmobException e) {
                            if (e == null) {
                                if (list.listIterator().next().getUser_password().equals(pass)) {
                                    Log.d("1111", "done: 登录成功");
                                    setUserId(id);
                                    Log.d("11111111suc", list.listIterator().next().getUser_name());
                                } else {
                                    Log.d("11111111116", "done: 密码错误");
                                }
                            } else {
                                Log.d("111111115", "done: 登录失败");
                                Log.d("111111115", e.getMessage());
                            }
                        }
                    });
                }
            }
        });
        getuserid();
        return userId;
    }
    public  String getuserid(){
        return userId;
    }
}
