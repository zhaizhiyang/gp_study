package com.gp.study.abstractFactory;

import com.gp.study.IPay;

/**
 * AliPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:01
 **/
public class AliPayFactory extends AbstractCrossPayFactory{


    @Override
    public ICrossPay createStridePay() {
        return new AliPay();
    }

    @Override
    public IPay createPay() {
        return new AliPay();
    }
}
