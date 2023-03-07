package com.lihh;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DisplayName("SpringBootMyBatisPlus 测试")
@SpringBootTest
public class SpringbootMyBatisPlusTests {

    @Autowired
    private EmpService empService;

    @Test
    @DisplayName("测试 查询")
    public void testSelect() {
        List<Emp> list = empService.list();
        list.forEach(System.out::println);
    }

    @DisplayName("测试 where条件")
    @Test
    public void testWhere() {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("job", "CLERK");

        List<Emp> list =  empService.list(queryWrapper);
        list.forEach(System.out::println);
    }

    @DisplayName("测试 插入")
    @Test
    public void testInsert() {
        // 先删除 后插入
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("empno", 8888);
        empService.remove(queryWrapper);


        Emp emp = new Emp(8888, "aaaa", "CLERK", 7788, "1987-05-23", 1100.00, null, 20);
        boolean saveFlag = empService.save(emp);
        System.out.println(saveFlag);
    }
}
