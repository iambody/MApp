package com.m.app.ui.module.test;

import com.m.app.ui.module.BBase;

/**
 * Created by datutu on 2016/10/27.
 */

public class BCourse extends BBase {
    private String CourseName;

    public BCourse() {
    }

    public BCourse(String courseName) {
        CourseName = courseName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }
}
