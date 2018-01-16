package com.zyzhang.bibi;

import java.util.List;

/**
 * @Description:
 * @Author: zyzhang
 * @Date: 18/1/15 下午2:34
 */
public class Student {
    private String name;//姓名
    private List<Course> coursesList;//所修的课程

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }
}
