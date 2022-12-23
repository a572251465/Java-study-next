package com.lihh.controller;

import com.github.pagehelper.PageInfo;
import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/findAll/{pageNum}/{pageSize}")
    public PageInfo<Emp> findAll(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
        return empService.findAll(pageNum, pageSize);
    }
}
