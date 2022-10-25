package com.lihh.mapper;

import com.lihh.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select id, name, age from pl_user")
    List<User> queryAllUser();
}
