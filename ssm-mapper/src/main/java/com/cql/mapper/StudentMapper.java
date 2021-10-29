package com.cql.mapper;

import com.cql.entity.Student;

import java.util.List;

public interface StudentMapper {
    public Integer addOne(Student student);

    public List<Student> getAll();
}
