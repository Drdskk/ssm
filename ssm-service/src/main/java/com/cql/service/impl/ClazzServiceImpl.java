package com.cql.service.impl;

import com.cql.entity.Clazz;
import com.cql.mapper.ClazzMapper;
import com.cql.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clazzService")
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;

    public List<Clazz> findAll(){
        List<Clazz> clazzList=clazzMapper.findAll();
        return clazzList;
    }
}
