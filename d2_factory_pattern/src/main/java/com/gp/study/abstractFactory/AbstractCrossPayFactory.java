package com.gp.study.abstractFactory;


/**
 * AbstractCrossPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  18:34
 **/
public abstract class AbstractCrossPayFactory extends AbstractPayFactory{

    /**
     * 跨境支付
     * @return
     */
    public abstract ICrossPay createStridePay();
}
