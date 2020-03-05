package com.gp.study.decorator.navbars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * create by zhiyang.zhai 2020/3/5
 */
public class VipNavBarDecorator extends NavBarDecorator {

    private List<String> vipBars = new ArrayList<>(Arrays.asList("成长墙", "作业", "题库"));


    public VipNavBarDecorator(NavBar navBar) {
        super(navBar);
    }

    @Override
    public List<String> showBars() {
        super.showBars().addAll(vipBars);
        return super.showBars();
    }

}
