package com.gp.study.decorator.navbars;

/**
 * create by zhiyang.zhai 2020/3/5
 */
public class NavBarTest {


    public static void main(String[] args) {
        NavBar noLoginNavBar = new NoLoginNavBar();
        System.out.println("未登录导航条：" + noLoginNavBar.showBars());
        noLoginNavBar = new VipNavBarDecorator(noLoginNavBar);
        System.out.println("VIP导航条：" + noLoginNavBar.showBars());
    }
}
