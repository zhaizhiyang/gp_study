package com.gp.study.adapter.adapters;


import com.gp.study.adapter.PassportService;
import com.gp.study.adapter.ResultMsg;

/**
 * Created by Tom.
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String[] params)  {
        if (params == null || params.length == 0) {
            return new ResultMsg( -1, "参数非法", null);
        }
        String param1 = params[0];
        String param2 = "THIRD_EMPTY";
        if (params.length >= 2 && null != params[1]) {
            param2 = params[1];
        }
        super.regist(param1,param2);
        return super.login(param1,param2);
    }
}
