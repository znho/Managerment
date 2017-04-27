package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Person_info;
import com.gdaib.pojo.Person_infoExample;
import org.apache.ibatis.annotations.Param;

public interface Person_infoMapper {
    int countByExample(Person_infoExample example);

    int deleteByExample(Person_infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Person_info record);

    int insertSelective(Person_info record);

    List<Person_info> selectByExample(Person_infoExample example);

    Person_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Person_info record, @Param("example") Person_infoExample example);

    int updateByExample(@Param("record") Person_info record, @Param("example") Person_infoExample example);

    int updateByPrimaryKeySelective(Person_info record);

    int updateByPrimaryKey(Person_info record);
}