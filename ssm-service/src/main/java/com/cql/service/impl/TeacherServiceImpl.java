package com.cql.service.impl;

import com.cql.entity.Teacher;
import com.cql.mapper.TeacherMapper;
import com.cql.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public String addOne(Teacher teacher) {
        Integer flag=teacherMapper.addOne(teacher);
        if(flag==1){
            return "添加成功。。。";
        }
        return "添加失败。。。";
    }

    @Override
    public String delOne(Integer teacher_id) {
        Integer flag=teacherMapper.delOne(teacher_id);
        if(flag==1){
            return "删除成功。。。";
        }
        return "删除失败。。。";
    }

    @Override
    public String setOne(Teacher teacher) {
        if(teacher.getTeacher_id()==null){
            return "请选择老师id";
        }
        Integer flag=teacherMapper.setOne(teacher);
        if(flag==1){
            return "修改成功。。。";
        }
        return "修改失败。。。";
    }

    @Override
    public List<Teacher> getMoreThanOne(Teacher teacher) {
        return teacherMapper.getMoreThanOne(teacher);
    }
}
