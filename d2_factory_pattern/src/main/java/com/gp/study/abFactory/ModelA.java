package com.gp.study.abFactory;

/**
 * ModelA
 *
 * @author zhaizhiyang
 * @date 2020/2/25  17:06
 **/
public class ModelA implements IModel{
    @Override
    public void make() {
        System.out.println("ModelA make");
    }
}
