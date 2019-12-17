package com.example.focus3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.focus3.Dao.TimeSelect;
import com.example.focus3.View.SetTimeView;


public class SetTimeActivity extends AppCompatActivity implements TimeSelect.TimePickerDialogInterface, SetTimeView {
    //时间选择器
    TimeSelect timeSelect = new TimeSelect(SetTimeActivity.this);
    int hour, min;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time);
    }

    public void set_rel_time(View view) {
        String time = showSetTime(true);
        Log.d("1111111111", time);
    }

    public void set_abs_time(View view) {

    }

    @Override
    public int positiveListener() {
        hour = timeSelect.getHour();
        min = timeSelect.getMinute();
        Log.d("1111111111", String.valueOf(hour * 100 + min));
        return hour * 100 + min;
    }

    @Override
    public String showSetTime(Boolean isLogin) {
        timeSelect.showTimePickerDialog();
        return String.valueOf(positiveListener());
    }
}
// {
//

//         Time ti=list.get(0);
//         Log.e("zhjixing","done: 555555555");
//         ti.save(new SaveListener<String>(){
//@Override
//public void done(String s,BmobException e){
//        Log.e("zhjixing","done: 666666666666");
//        if(e!=null)
//        {
//        Log.d("zhjixing","done:插入成功");
//        Log.d("zhjixing","done: 失败"+e.toString());
//        }
//        else
//        {
//
//        Log.d("zhjixing","done:插入");
//        }
//        }
//        });
//        }