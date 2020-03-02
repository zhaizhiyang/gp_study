package com.gp.study.builder;

/**
 * create by zhiyang.zhai 2020/3/2
 */
public class BuilderTest {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.addBase("base");
        builder.addUpdate("update");
        Car car = builder.builder();
        System.out.println(car);
        CarBuilder builder1 = new CarBuilder();
        builder1.addUpdate("base+1");
        Car car1 = builder1.builder();
        System.out.println(car == car1);
    }
}
