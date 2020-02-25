package com.gp.study.abFactory;

/**
 * AFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/25  17:24
 **/
public class AFactory extends Factory{
    @Override
    public IProduct manufactureContainer() {
        return new ProductA();
    }

    @Override
    public IModel manufactureMould() {
        return new ModelA();
    }
}
