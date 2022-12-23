package com.lihh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lihh.mapper.EmpMapper;
import com.lihh.pojo.Emp;
import com.lihh.service.EmpService;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
}
