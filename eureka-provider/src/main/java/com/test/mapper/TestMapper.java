package com.test.mapper;

import com.test.model.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {

    @Select(value = "select * from test where id=#{id}")
    public Test getById(@Param("id") String id);
}
