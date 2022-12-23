package com.lihh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lihh.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}
