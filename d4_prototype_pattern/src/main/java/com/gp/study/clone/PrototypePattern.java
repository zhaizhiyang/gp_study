package com.gp.study.clone;


import java.util.HashMap;
import java.util.Map;

/**
 * create by zhiyang.zhai 2020/3/1
 */

public class PrototypePattern {


    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(2);
        Map<String, Double> scoreMap = new HashMap<>();
        scoreMap.put("yuwen", 90.5);
        student.setScoreMap(scoreMap);

        Student studentClone =student.deepClone();
        System.out.println(student);
        System.out.println(student == studentClone);
        System.out.println(studentClone);
        studentClone.setName("李四");
        System.out.println(studentClone);
        System.out.println(studentClone == student);
    }
}
