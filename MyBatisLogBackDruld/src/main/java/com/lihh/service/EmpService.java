package com.lihh.service;

import com.github.pagehelper.PageInfo;
import com.lihh.pojo.Emp;

public interface EmpService {
    PageInfo<Emp> findAll(Integer pageNum, Integer pageSize);
}
