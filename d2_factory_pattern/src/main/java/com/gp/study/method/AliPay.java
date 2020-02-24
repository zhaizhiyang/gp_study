package com.gp.study.method;


import com.gp.study.IPay;

/**
 * AliPay
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:01
 **/
public class AliPay implements IPay {
    @Override
    public void pay() {
        System.out.println("AliPay");
    }
}
