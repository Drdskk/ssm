package com.cql.test;

import com.cql.entity.Clazz;
import com.cql.mapper.ClazzMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-mapper.xml")
public class ClazzTest {
    @Autowired
    private ClazzMapper clazzMapper;

    @Test
    public void clazzFindAllTest(){
        List<Clazz> clazzList=clazzMapper.findAll();
        for(Clazz clazz:clazzList){
            System.out.println("id:"+clazz.getClazz_id()+","+"name："+clazz.getClazz_name());
        }
    }

}
