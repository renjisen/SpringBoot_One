package com.rjs;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rjs.mapper.UserMapper;
import com.rjs.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void Test(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("uname","age");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }
}
