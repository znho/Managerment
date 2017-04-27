package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_om;
import com.gdaib.pojo.Mapping_omExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_omMapper {
    int countByExample(Mapping_omExample example);

    int deleteByExample(Mapping_omExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_om record);

    int insertSelective(Mapping_om record);

    List<Mapping_om> selectByExample(Mapping_omExample example);

    Mapping_om selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_om record, @Param("example") Mapping_omExample example);

    int updateByExample(@Param("record") Mapping_om record, @Param("example") Mapping_omExample example);

    int updateByPrimaryKeySelective(Mapping_om record);

    int updateByPrimaryKey(Mapping_om record);
}