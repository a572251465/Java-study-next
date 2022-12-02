package com.lihh;

import com.lihh.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

    @Test
    public void empTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = applicationContext.getBean("empDao", EmpDao.class);
        empDao.add();
    }
}
