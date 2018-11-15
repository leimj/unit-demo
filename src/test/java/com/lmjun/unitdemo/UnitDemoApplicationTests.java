package com.lmjun.unitdemo;

import com.lmjun.unitdemo.dao.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitDemoApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void contextLoads() {


        List<com.lmjun.unitdemo.entity.Test> list = testMapper.selectAll();

        System.out.println(list.size());

    }

}
