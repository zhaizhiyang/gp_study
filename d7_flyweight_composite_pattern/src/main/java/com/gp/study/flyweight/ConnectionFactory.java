package com.gp.study.flyweight;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public class ConnectionFactory {
    private static ConnectionFactory factory;

    private List<ConnectionInfo> list;

    private ConnectionFactory(Integer poolSize) {
        list = new ArrayList<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            list.add(new ConnectionInfo());
        }
    }

    public static ConnectionFactory getInstance(Integer poolSize) {
        if (factory == null) {
            synchronized (ConnectionFactory.class) {
                if (factory == null) {
                    factory = new ConnectionFactory(poolSize);
                }
            }
        }
        return factory;
    }

    public ConnectionInfo getConnection() {
        if (list != null && list.size() > 0) {
            return this.list.get(0);
        }
        return null;
    }

}
