package com.gp.study.method;

/**
 * MethodTest
 *
 * @author zhaizhiyang
 * @date 2020/2/24  17:01
 **/
public class MethodTest {
    public static void main(String[] args) {
        IPayFactory factory = new AliPayFactory();
        factory.createPay().pay();
    }
}
