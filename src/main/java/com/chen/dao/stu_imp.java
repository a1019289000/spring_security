package com.chen.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface stu_imp {
    @Select("select * from stu")
    List<Stu> get();
}
