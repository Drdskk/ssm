package com.cql.service;

import com.cql.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public String addOne(Teacher teacher);
    public String delOne(Integer teacher_id);
    public String setOne(Teacher teacher);
    public List<Teacher> getMoreThanOne(Teacher teacher);
}
