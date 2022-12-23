package com.lihh.mapper;

import com.lihh.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> findAll();
}
