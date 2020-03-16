package com.gp.study.composite;

/**
 * create by zhiyang.zhai . 2020/3/8 0008
 **/
public class NodeTest {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root",1);
        BranchNode branch = new BranchNode("branch",2);
        BranchNode branchA1 = new BranchNode("branchA1",3);
        branchA1.addNode(new LeafNode("leaf-A1-1"));
        branch.addNode(new LeafNode("leaf-1"));
        branch.addNode(new LeafNode("leaf-2"));
        branch.addNode(branchA1);
        root.addNode(new LeafNode("leaf1"));
        root.addNode(branch);
        root.show();
        branch.removeNode(branchA1);
        root.show();
    }
}
