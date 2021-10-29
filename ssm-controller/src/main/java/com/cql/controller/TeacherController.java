package com.cql.controller;

import com.cql.entity.Teacher;
import com.cql.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/teacher",produces="text/html;charset=utf-8")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value="/addOne")
    public String addOne(Teacher teacher){
        return teacherService.addOne(teacher);
    }

    @RequestMapping(value="/delOne")
    public String delOne(Integer teacher_id){
        return teacherService.delOne(teacher_id);
    }

    @RequestMapping(value="/setOne")
    public String setOne(Teacher teacher) {return teacherService.setOne(teacher);}

    @RequestMapping(value="/getMoreThanOne",produces="application/json;charset=utf-8")
    public List<Teacher> getMoreThanOne(Teacher teacher){return teacherService.getMoreThanOne(teacher);}
}
