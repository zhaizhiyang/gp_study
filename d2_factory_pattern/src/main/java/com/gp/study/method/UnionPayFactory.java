package com.gp.study.method;



import com.gp.study.IPay;

/**
 * UnionPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:55
 **/
public class UnionPayFactory implements IPayFactory{

    @Override
    public IPay createPay() {
        return new UnionPay();
    }
}
