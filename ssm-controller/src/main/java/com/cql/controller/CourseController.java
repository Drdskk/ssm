package com.cql.controller;

import com.cql.entity.Course;
import com.cql.entity.Teacher;
import com.cql.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/course",produces="text/html;charset=utf-8")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value="/addOne")
    public String addOne(Course course){
        return courseService.addOne(course);
    }

    @RequestMapping(value="/addByCondition")
    public String addByCondition(Teacher teacher,Course course){return courseService.addByCondition(teacher,course);}

    @RequestMapping(value="/delOne")
    public String delOne(Integer course_id){
        return courseService.delOne(course_id);
    }

    @RequestMapping(value="/setOne")
    public String setOne(Teacher teacher,Course course) {return courseService.setOne(teacher,course);}

    @RequestMapping(value="/getMoreThanOne",produces="application/json;charset=utf-8")
    public List<Course> getMoreThanOne(Course course){return courseService.getMoreThanOne(course);}

    @RequestMapping(value="/setByCondition",produces="application/json;charset=utf-8")
    public String setByCondition(Teacher teacher,Course course){
        return courseService.setByCondition(teacher,course);
    }
}
