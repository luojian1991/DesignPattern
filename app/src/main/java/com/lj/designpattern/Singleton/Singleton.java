package com.lj.designpattern.Singleton;

import android.content.Context;

/**
 * 静态内部类单例模式
 * 优点：线程安全，资源利用率高，不执行getInstance不生产实例
 *  缺点：第一次加载反应慢，在一些场景下是无法使用的，比如对象创建需要传入参数
 * Created by ff on 2018/3/13.
 */

public class Singleton {
    private Context mContext;
    private Singleton(){

    }
    private static class InstanceHolder{
        private static  final  Singleton singleton = new Singleton();

    }
    public static Singleton getInstance(Context context){
        return  InstanceHolder.singleton;
    }
}
