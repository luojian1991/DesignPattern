package com.lj.designpattern.Singleton;

/**
 * 单例模式
 * 懒汉式，双锁方式
 * 优点：资源利用率高，不执行getInstance不会生成实例，多线程下效率高
 * 缺点：第一次加载反应慢，由于Java内存模型一些原因，高并发偶尔会失败，发生概率小
 * 假设线程A执行到singleton = new LazeSingleton这句，这里看起来是一句话，但实际上它并不是一个原子
 * 操作，我们只要看看这句话被编译后再JVM执行的对应汇编代码就发现，这句话被编译成的8条汇编指令，
 * 大致做了3件事情，
 * 1，给LazySingleton的实例分配内存
 * 2.初始化LazySingleton()的构造器
 * 3.将singleton对象指向分配的内存空间
 * 但是 ，由于Java编译器允许处理器乱序处理，以及JDK1.5之前的JMM(Java Memory Model,即Java的内存模型),
 * 中的Cache、寄存器到主内存回写顺序的规定，上面的第二点和第三点的顺序是无法保证的，也就是说，执行
 * 顺序可能是1-2-3也可能是1-3-2，如果是后者，并且在3执行完毕、2未执行之前，被切换到线程B上，这时候
 * singleton 已经在线程A执行了第三点了，singleton不是null的了,所以B直接拿走singleton,然后使用，就会
 * 报错，这种错误难以跟踪和重现会隐藏很久
 * Java 1.5之后的版本已经调整了JMM,具体化了volatile关键字。
 * 参考博客：http://blog.csdn.net/ns_code/article/details/17359719
 * Created by ff on 2018/3/13.
 */

public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;

    }

}
