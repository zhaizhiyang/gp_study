package com.gp.study.abFactory;

/**
 * ModelB
 *
 * @author zhaizhiyang
 * @date 2020/2/25  17:06
 **/
public class ModelB implements IModel{
    @Override
    public void make() {
        System.out.println("ModelB make");
    }
}
