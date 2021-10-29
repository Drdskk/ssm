package com.cql.service.impl;

import com.cql.entity.Student;
import com.cql.mapper.StudentMapper;
import com.cql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String addOne(Student student) {
        Integer flag=studentMapper.addOne(student);
        if(flag==1){
            return "添加成功。。。";
        }
        return "添加失败。。。";
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
