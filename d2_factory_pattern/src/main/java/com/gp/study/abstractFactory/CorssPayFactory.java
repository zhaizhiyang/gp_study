package com.gp.study.abstractFactory;

import com.gp.study.IPay;

/**
 * AbstractPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  18:34
 **/
public class CorssPayFactory extends AbstractCrossPayFactory{

    @Override
    public ICrossPay createStridePay() {
        return new CorssPay();
    }

    @Override
    public IPay createPay() {
        return new CorssPay();
    }
}
