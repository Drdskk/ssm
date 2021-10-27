package com.cql.controller;

import com.cql.entity.Clazz;
import com.cql.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
    @Autowired
    private ClazzService clazzService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Clazz> findAll(){
        List<Clazz> clazzList=clazzService.findAll();
        return clazzList;
    }
}
