package com.cql.test;

import com.cql.entity.Clazz;
import com.cql.service.ClazzService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext*.xml")
public class ClazzTest {
    @Autowired
    private ClazzService clazzService;

    @Test
    public void clazzFindAll(){
        List<Clazz> clazzList=clazzService.findAll();
        for(Clazz clazz:clazzList){
            System.out.println("id:"+clazz.getClazz_id()+","+"name："+clazz.getClazz_name());
        }
    }
}
