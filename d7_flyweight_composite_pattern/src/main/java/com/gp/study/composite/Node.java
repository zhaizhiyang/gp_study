package com.gp.study.composite;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public abstract class Node {

    protected String name;

    public Node( String name) {
        this.name = name;
    }

    public abstract void show();
}
