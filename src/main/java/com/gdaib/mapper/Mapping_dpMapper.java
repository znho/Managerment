package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_dp;
import com.gdaib.pojo.Mapping_dpExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_dpMapper {
    int countByExample(Mapping_dpExample example);

    int deleteByExample(Mapping_dpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_dp record);

    int insertSelective(Mapping_dp record);

    List<Mapping_dp> selectByExample(Mapping_dpExample example);

    Mapping_dp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_dp record, @Param("example") Mapping_dpExample example);

    int updateByExample(@Param("record") Mapping_dp record, @Param("example") Mapping_dpExample example);

    int updateByPrimaryKeySelective(Mapping_dp record);

    int updateByPrimaryKey(Mapping_dp record);
}