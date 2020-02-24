package com.gp.study.abstractFactory;

/**
 * AbstractPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  18:34
 **/
public class CorssPay implements ICrossPay{
    @Override
    public void stridePay() {
        System.out.println("CorssPay stridePay");
    }

    @Override
    public void pay() {
        System.out.println("CorssPay pay");
    }
}
