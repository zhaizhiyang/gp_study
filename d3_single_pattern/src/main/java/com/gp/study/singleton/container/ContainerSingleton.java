package com.gp.study.singleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by zhiyang.zhai 2020/2/27
 */
public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static ContainerSingleton getInstance(Class cls){
        if (!ioc.containsKey(cls.getName())) {
            synchronized (ioc) {
                if (!ioc.containsKey(cls.getName())) {
                    try {
                        ioc.put(cls.getName(), cls.newInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return (ContainerSingleton) ioc.get(cls.getName());
    }


}
