package com.example.focus3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.focus3.Dao.User;
import com.example.focus3.Presenter.RegiAndLoginPre;
import com.example.focus3.View.RegiserAndLoginView;

public class LoginActivity extends AppCompatActivity implements RegiserAndLoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    @Override
    public User showLogin() {
        User user = new User();
        EditText edtid = findViewById(R.id.edtid);
        String id=edtid.getText().toString();
        EditText edtpass = findViewById(R.id.edtpass);
        String pass=edtpass.getText().toString();
        user.setUser_tel(id);
        user.setUser_email(id);
        user.setUser_password(pass);
        return user;
    }

    @Override
    public User showRegister() {
        return null;
    }

    //登录btn实现
    public void login(View view) {
       new RegiAndLoginPre<>(LoginActivity.this).loginDo();
    }

    public void close_login(View view) {
        finish();
    }
}
