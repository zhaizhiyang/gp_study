package com.gp.study.abstractFactory;

import com.gp.study.IPay;

public class AbstractTest {


    public static void main(String[] args) {
        AliPayFactory aliPayFactory = new AliPayFactory();
        AliPay aliPay = (AliPay) aliPayFactory.createPay();
        aliPay.stridePay();
        aliPay.pay();
        UnionPayFactory unionPay = new UnionPayFactory();
        IPay pay = unionPay.createPay();
        pay.pay();
    }
}
