package com.lj.designpattern.Observer.custom;

import java.util.*;

/**
 * Created by ff on 2018/3/15.
 */

public class ObjectFor3D implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
