package com.gp.study.builder;

/**
 * create by zhiyang.zhai 2020/3/2
 */
public class Car {
    private String base;

    private String update;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("base='").append(base).append('\'');
        sb.append(", update='").append(update).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
