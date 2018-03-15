package com.lj.designpattern.Observer;

import java.util.Observable;

/**
 * Created by ff on 2018/3/15.
 */

public class SubjectFor3d extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 主题更新
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
