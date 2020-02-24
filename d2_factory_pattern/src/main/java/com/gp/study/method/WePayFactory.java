package com.gp.study.method;



import com.gp.study.IPay;

/**
 * WePayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:55
 **/
public class WePayFactory implements IPayFactory{

    @Override
    public IPay createPay() {
        return new WePay();
    }
}
