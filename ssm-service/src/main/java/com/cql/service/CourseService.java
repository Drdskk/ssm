package com.cql.service;

import com.cql.entity.Course;
import com.cql.entity.Teacher;

import java.util.List;

public interface CourseService {
    public String addOne(Course course);
    public String addByCondition(Teacher teacher,Course course);
    public String delOne(Integer course_id);
    public String setOne(Teacher teacher,Course course);
    public String setByCondition(Teacher teacher,Course course);
    public List<Course> getMoreThanOne(Course course);
}
