package com.lihh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lihh.mapper.EmpMapper;
import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageInfo<Emp> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Emp> list = empMapper.findAll();
        PageInfo<Emp> info = new PageInfo<>(list);
        return info;
    }
}
