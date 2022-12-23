package com.lihh.controller;

import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/findAll")
    public List<Emp> findAll() {
        return empService.list();
    }
}
