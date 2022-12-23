package com.lihh;

import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DisplayName("SpringBootMyBatisPlus 测试")
@SpringBootTest
public class SpringbootMyBatisPlusTests {

    @Autowired
    private EmpService empService;

    @DisplayName("测试 查询")
    @Test
    public void testSelect() {
        List<Emp> list = empService.list();
        list.forEach(System.out::print);
    }
}
