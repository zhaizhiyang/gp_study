package com.gp.study.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public class BranchNode extends Node {

    private Integer level;

    public List<Node> childNodes;

    public BranchNode(String name, Integer level) {
        super(name);
        this.level = level;
        this.childNodes = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println("+" + this.name);
        for (Node node : childNodes) {
            for (int i = 0; i < this.level; i++) {
                System.out.print("  ");
            }
            node.show();
        }
    }

    public boolean addNode(Node node) {
        return childNodes.add(node);
    }

    public boolean removeNode(Node node) {
        System.out.println("移除节点：" + node.name);
        return childNodes.remove(node);
    }

    public Integer childCount() {
        return this.childNodes.size();
    }

    public List<Node> getChildNodes() {
        return this.childNodes;
    }
}
