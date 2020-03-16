package com.gp.study.adapter.adapters;


import com.gp.study.adapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForQQAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String[] params,Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegist(params);
    }

}
