package com.lj.designpattern.Observer.custom;

import android.util.Log;

/**
 * Created by ff on 2018/3/15.
 */

public class Observer1 implements Observer {

    @Override
    public void update(String msg) {
        Log.d("observer1", "observer1得到3D号码  -->" + msg + "我要记下来");
    }
}
