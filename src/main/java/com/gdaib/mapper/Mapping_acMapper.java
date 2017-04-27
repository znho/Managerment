package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_ac;
import com.gdaib.pojo.Mapping_acExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_acMapper {
    int countByExample(Mapping_acExample example);

    int deleteByExample(Mapping_acExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_ac record);

    int insertSelective(Mapping_ac record);

    List<Mapping_ac> selectByExample(Mapping_acExample example);

    Mapping_ac selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_ac record, @Param("example") Mapping_acExample example);

    int updateByExample(@Param("record") Mapping_ac record, @Param("example") Mapping_acExample example);

    int updateByPrimaryKeySelective(Mapping_ac record);

    int updateByPrimaryKey(Mapping_ac record);
}