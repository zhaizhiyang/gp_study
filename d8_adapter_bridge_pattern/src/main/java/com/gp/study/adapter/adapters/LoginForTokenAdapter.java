package com.gp.study.adapter.adapters;


import com.gp.study.adapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String[] params, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegist(params);
    }

}
