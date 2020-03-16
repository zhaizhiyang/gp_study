package com.gp.study.composite;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public class LeafNode extends Node {

    public LeafNode(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
