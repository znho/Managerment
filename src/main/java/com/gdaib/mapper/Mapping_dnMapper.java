package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_dn;
import com.gdaib.pojo.Mapping_dnExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_dnMapper {
    int countByExample(Mapping_dnExample example);

    int deleteByExample(Mapping_dnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_dn record);

    int insertSelective(Mapping_dn record);

    List<Mapping_dn> selectByExample(Mapping_dnExample example);

    Mapping_dn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_dn record, @Param("example") Mapping_dnExample example);

    int updateByExample(@Param("record") Mapping_dn record, @Param("example") Mapping_dnExample example);

    int updateByPrimaryKeySelective(Mapping_dn record);

    int updateByPrimaryKey(Mapping_dn record);
}