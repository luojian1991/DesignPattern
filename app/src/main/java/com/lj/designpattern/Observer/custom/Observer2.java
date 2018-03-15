package com.lj.designpattern.Observer.custom;

import android.util.Log;

/**
 * Created by ff on 2018/3/15.
 */

public class Observer2 implements Observer {

    @Override
    public void update(String msg) {
        Log.d("observer1", "observer2得到3D号码  -->" + msg + "我要告诉舍友");
    }
}
