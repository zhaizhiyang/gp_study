package com.gp.study.decorator.navbars;

import java.util.List;

/**
 * create by zhiyang.zhai 2020/3/5
 */
public abstract class NavBarDecorator extends NavBar {

    private NavBar navBar;

    public NavBarDecorator(NavBar navBar) {
        this.navBar = navBar;
    }

    @Override
    public List<String> showBars() {
        return this.navBar.showBars();
    }

}
