package com.gp.study.singleton.container;

/**
 * create by zhiyang.zhai 2020/2/27
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        ContainerSingleton instance = ContainerSingleton.getInstance(ContainerSingleton.class);
        System.out.println(Thread.currentThread().getName() + "-----" + instance);
    }
}
