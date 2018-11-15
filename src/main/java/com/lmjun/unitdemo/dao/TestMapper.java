package com.lmjun.unitdemo.dao;

import com.lmjun.unitdemo.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 雷明军
 * @des: ${todo}
 * @date 2018/11/15 15:48
 * @package com.lmjun.unitdemo.dao
 */
@Repository
public interface TestMapper {

    List<Test> selectAll();

}
