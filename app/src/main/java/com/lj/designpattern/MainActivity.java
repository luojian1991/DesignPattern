package com.lj.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lj.designpattern.Singleton.SingletonEnum;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvTest = findViewById(R.id.tv_test);
        tvTest.setText(SingletonEnum.INSTANCE.getStr());
    }
}
