package com.gp.study.decorator.navbars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * create by zhiyang.zhai 2020/3/5
 */
public class NoLoginNavBar extends NavBar {

    private List<String> bars = new ArrayList<>(Arrays.asList("问答", "文章", "商城"));

    @Override
    public List<String> showBars() {
        return bars;
    }
}
