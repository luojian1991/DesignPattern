package com.lj.designpattern.Singleton;

/**
 * 枚举单例
 * 优点：避免多线程同步问题，而且还能防止反序列化重新创建对象
 * 缺点：Android上面枚举消耗大，是静态的两倍，不提倡使用枚举
 * Created by ff on 2018/3/15.
 */

public enum SingletonEnum {
    INSTANCE;
    public String str = "1";
    public String getStr(){
        return "你好";
    }
}
