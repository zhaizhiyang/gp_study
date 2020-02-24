package com.gp.study.abstractFactory;

import com.gp.study.IPay;

/**
 * AbstractPayFactory
 *
 * @author zhaizhiyang
 * @date 2020/2/24  18:34
 **/
public abstract class AbstractPayFactory {

    /**
     * 国内支付
     * @return
     */
    public abstract IPay createPay();

}
