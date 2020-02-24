package com.gp.study.simple;

import com.gp.study.IPay;

/**
 * AbstractPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:33
 **/
public class PayFactory {

    private static PayFactory payFactory;

    private PayFactory() {
    }

    public static PayFactory createFactory() {
        if (payFactory == null) {
            payFactory = new PayFactory();
        }
        return payFactory;
    }

    public IPay createPay(Class<? extends IPay> cls) throws IllegalAccessException, InstantiationException {
        if (cls == null) {
            throw new RuntimeException("支付渠道有误");
        }
        return cls.newInstance();
    }
}
