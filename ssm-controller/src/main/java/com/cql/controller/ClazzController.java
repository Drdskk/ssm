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

    /**
     * 查询并 返回所有班级信息
     * @return
     */
    @RequestMapping("/getAll")
    @ResponseBody
    public List<Clazz> getAll(){
        List<Clazz> clazzList=clazzService.getAll();
        return clazzList;
    }
}
