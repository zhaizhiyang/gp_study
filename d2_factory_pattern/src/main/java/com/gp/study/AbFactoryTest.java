package com.gp.study.abFactory;

/**
 * AbFactoryTest
 *
 * @author zhaizhiyang
 * @date 2020/2/25  17:25
 **/
public class AbFactoryTest {

    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        aFactory.manufactureContainer().show();
        aFactory.manufactureMould().make();
    }
}
