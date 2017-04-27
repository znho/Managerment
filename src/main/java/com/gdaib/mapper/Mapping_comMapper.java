package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_com;
import com.gdaib.pojo.Mapping_comExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_comMapper {
    int countByExample(Mapping_comExample example);

    int deleteByExample(Mapping_comExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_com record);

    int insertSelective(Mapping_com record);

    List<Mapping_com> selectByExample(Mapping_comExample example);

    Mapping_com selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_com record, @Param("example") Mapping_comExample example);

    int updateByExample(@Param("record") Mapping_com record, @Param("example") Mapping_comExample example);

    int updateByPrimaryKeySelective(Mapping_com record);

    int updateByPrimaryKey(Mapping_com record);
}