package com.lj.designpattern.Singleton;

/**
 * 饿汉式
 * 优点：线程安全,调用时反应速度快，在类加载的同时已经创建好一个静态对象
 * 缺点：资源利用效率不高，可能该实例并不需要，但也被系统加载了。另外饿汉式在一些场景下是无法使用的
 * ，比如对象创建需要传入参数或配置文件，在调用getInstance之前对象已经生成，不能传入参数了
 * 参考博客：http://blog.csdn.net/ns_code/article/details/17359719
 * Created by ff on 2018/3/13.
 */

public class Single {
    private static Single single = new Single();
    private Single(){

    }
    public static Single getInstance(){
        return single;
    }

}
