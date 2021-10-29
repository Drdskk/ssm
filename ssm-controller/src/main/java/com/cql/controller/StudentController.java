package com.cql.controller;

import com.cql.entity.Student;
import com.cql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 添加一个学生信息 返回执行结果
     * @param student
     * @return
     */
    @RequestMapping(value="/addOne",produces="text/html;charset=utf-8")
    @ResponseBody
    public String addOne(Student student){
        return studentService.addOne(student);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value="/getAll")
    @ResponseBody
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
