package com.example.focus3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.focus3.Dao.User;
import com.example.focus3.Presenter.RegiAndLoginPre;
import com.example.focus3.View.RegiserAndLoginView;

public class RegisterActivity extends AppCompatActivity implements RegiserAndLoginView {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new RegiAndLoginPre<>(RegisterActivity.this).registerDo();
            }
        });
    }

    @Override
    public User showLogin() {
        return null;
    }

    @Override
    public User showRegister() {
        User user=new User();
        EditText edtname =findViewById(R.id.name);
        String name=edtname.getText().toString();
        EditText edtpassword =findViewById(R.id.password);
        String password=edtpassword.getText().toString();
        EditText editemail =findViewById(R.id.email);
        String email=editemail.getText().toString();
        EditText edittel =findViewById(R.id.tel);
        String tel=edittel.getText().toString();
        user.setUser_name(name);
        user.setUser_password(password);
        user.setUser_email(email);
        user.setUser_tel(tel);
        return user;
    }
    public void close_register(View view) {
      finish();
    }
}
