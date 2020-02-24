package com.gp.study.simple;

import com.gp.study.IPay;

/**
 * SimpleTest
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:32
 **/
public class SimpleTest {
    public static void main(String[] args) {
        PayFactory payFactory = PayFactory.createFactory();
        try {
            IPay pay = payFactory.createPay(WePay.class);
            pay.pay();
            IPay pay1 = payFactory.createPay(UnionPay.class);
            pay1.pay();
            IPay pay2 = payFactory.createPay(WePay.class);
            pay2.pay();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
