package com.m.app.ui.module.test;

import com.m.app.ui.module.BBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by datutu on 2016/10/27.
 */

public class BStudent extends BBase {
    private String Name;
    private int Age;
    private List<BCourse> MyCourse = new ArrayList<>();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<BCourse> getMyCourse() {
        return MyCourse;
    }

    public void setMyCourse(List<BCourse> myCourse) {
        MyCourse = myCourse;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public BStudent() {
    }

    public BStudent(String name, List<BCourse> myCourse) {
        Name = name;
        MyCourse = myCourse;
    }

    public BStudent(String name) {
        Name = name;
    }
}
