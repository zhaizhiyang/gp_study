package com.gp.study.clone;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * create by zhiyang.zhai 2020/3/1
 */
public class Student implements IDeepClone{

    private String name;

    private int age;

    private Map<String, Double> scoreMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Double> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(Map<String, Double> scoreMap) {
        this.scoreMap = scoreMap;
    }

    public Student deepClone() {
        return JSON.parseObject(JSON.toJSONString(this),this.getClass());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", scoreMap=").append(scoreMap);
        sb.append('}');
        return sb.toString();
    }
}
