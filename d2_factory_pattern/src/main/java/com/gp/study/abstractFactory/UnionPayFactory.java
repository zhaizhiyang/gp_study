package com.gp.study.abstractFactory;

import com.gp.study.IPay;

/**
 * UnionPay
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:01
 **/
public class UnionPayFactory extends AbstractPayFactory{

    @Override
    public IPay createPay() {
        return new UnionPay();
    }

}
