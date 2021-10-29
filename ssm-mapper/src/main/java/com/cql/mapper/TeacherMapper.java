package com.cql.mapper;

import com.cql.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    public Integer addOne(Teacher teacher);
    public Integer delOne(Integer teacher_id);
    public Integer setOne(Teacher teacher);
    public Teacher getOne(Teacher teacher);
    public List<Teacher> getMoreThanOne(Teacher teacher);
}
