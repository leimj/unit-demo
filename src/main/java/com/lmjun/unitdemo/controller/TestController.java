package com.lmjun.unitdemo.controller;

import com.lmjun.unitdemo.dao.TestMapper;
import com.lmjun.unitdemo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 雷明军
 * @des: ${todo}
 * @date 2018/11/15 15:45
 * @package com.lmjun.unitdemo.controller
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    public Map<String,String> test() {
        Map map = new HashMap();
        map.put("hello", "world");
        return map;
    }

    @RequestMapping("/selectall")
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }



}
