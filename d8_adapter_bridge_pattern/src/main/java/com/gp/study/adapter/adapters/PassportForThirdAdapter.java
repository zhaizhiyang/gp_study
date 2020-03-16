package com.gp.study.adapter.adapters;

import com.gp.study.adapter.ResultMsg;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class PassportForThirdAdapter implements IPassportForThird {

    private ILoginAdapter loginAdapter;

    public PassportForThirdAdapter(ILoginAdapter loginAdapter) {
        this.loginAdapter = loginAdapter;
    }


    @Override
    public ResultMsg loginForThrid(String[] params) {
        return processLogin(params);
    }

    private ResultMsg processLogin(String[] params){
        try {
            System.out.println("login by "+ loginAdapter.getClass().getSimpleName() +". params =" + Arrays.asList(params));
            return loginAdapter.login(params,loginAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
