package com.gp.study.simple;

import com.gp.study.IPay;

/**
 * UnionPay
 *
 * @author zhaizhiyang
 * @date 2020/2/24  16:01
 **/
public class UnionPay implements IPay{
    @Override
    public void pay() {
        System.out.println("UnionPay");
    }
}
