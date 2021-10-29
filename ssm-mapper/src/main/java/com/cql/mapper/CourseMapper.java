package com.cql.mapper;

import com.cql.entity.Course;
import com.cql.entity.Teacher;

import java.util.List;

public interface CourseMapper {
    public Integer addOne(Course course);
    public Integer delOne(Integer course_id);
    public Integer setOne(Course course);
    public Integer setByCondition(Course course);
    public List<Course> getMoreThanOne(Course course);
}
