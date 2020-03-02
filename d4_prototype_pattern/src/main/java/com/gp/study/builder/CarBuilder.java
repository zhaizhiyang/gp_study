package com.gp.study.builder;

/**
 * create by zhiyang.zhai 2020/3/2
 */
public class CarBuilder {

    private  Car car = new Car();

    public Car builder() {
        return this.car;
    }

    public CarBuilder addBase(String base) {
        car.setBase(base);
        return this;
    }

    public CarBuilder addUpdate(String update) {
        car.setUpdate(update);
        return this;
    }
}
