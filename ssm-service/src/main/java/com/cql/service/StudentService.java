package com.cql.service;

import com.cql.entity.Student;

import java.util.List;

public interface StudentService {
    public String addOne(Student student);

    public List<Student> getAll();
}
