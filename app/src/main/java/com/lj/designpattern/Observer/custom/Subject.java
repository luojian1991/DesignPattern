package com.lj.designpattern.Observer.custom;


/**
 * 主题接口，所以的主题必须实现这个接口
 * Created by ff on 2018/3/15.
 */

public interface Subject {

    /**
     * 注册一个观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
