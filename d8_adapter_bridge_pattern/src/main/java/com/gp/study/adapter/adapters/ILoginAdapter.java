package com.gp.study.adapter.adapters;


import com.gp.study.adapter.ResultMsg;

/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String[] params,Object adapter);
}
