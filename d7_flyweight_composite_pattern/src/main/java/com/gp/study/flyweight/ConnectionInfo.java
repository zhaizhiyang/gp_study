package com.gp.study.flyweight;

import java.sql.Connection;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public class ConnectionInfo {

    private Connection connection;

    /**
     * 0 空闲 1 占用
     */
    private Integer status;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ConnectionInfo(Connection connection, Integer status) {
        this.connection = connection;
        this.status = status;
    }

    public boolean release() {
        if (this.getStatus() == 0) {
            this.setStatus(1);
            return true;
        }
        return false;
    }
}
