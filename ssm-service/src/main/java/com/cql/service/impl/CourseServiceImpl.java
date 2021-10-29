package com.cql.service.impl;

import com.cql.entity.Course;
import com.cql.entity.Teacher;
import com.cql.mapper.CourseMapper;
import com.cql.mapper.TeacherMapper;
import com.cql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public String addOne(Course course) {
        Integer flag=courseMapper.addOne(course);
        if(flag==1){
            return "添加成功。。。";
        }
        return "添加失败。。。";
    }

    @Override
    public String addByCondition(Teacher teacher, Course course) {
        Integer flag2=teacherMapper.addOne(teacher);
        course.setTeacher_id(teacherMapper.getOne(teacher).getTeacher_id());
        Integer flag1=courseMapper.addOne(course);
        if(flag1==1 && flag2==1){
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public String delOne(Integer course_id) {
        Integer flag=courseMapper.delOne(course_id);
        if(flag==1){
            return "删除成功。。。";
        }
        return "删除失败。。。";
    }

    @Override
    public String setOne(Teacher teacher,Course course) {
        if(teacherMapper.getOne(teacher)!=null){
            course.setTeacher_id(teacherMapper.getOne(teacher).getTeacher_id());
        }
        Integer flag=courseMapper.setOne(course);
        if(flag==1){
            return "修改成功。。。";
        }
        return "修改失败。。。";
    }

    @Override
    public List<Course> getMoreThanOne(Course course) {
        return courseMapper.getMoreThanOne(course);
    }

    @Override
    public String setByCondition(Teacher teacher, Course course) {
        course.setTeacher_id(teacherMapper.getOne(teacher).getTeacher_id());
        Integer flag=courseMapper.setByCondition(course);
        if(flag==1){
            return "修改成功";
        }
        return "修改失败";
    }
}
