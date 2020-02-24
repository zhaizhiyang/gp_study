package com.gp.study.abstractFactory;

/**
 * AliPay
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:01
 **/
public class AliPay implements ICrossPay{
    @Override
    public void pay() {
        System.out.println("AliPay");
    }

    @Override
    public void stridePay() {
        System.out.println("CorssAliPay");
    }
}
