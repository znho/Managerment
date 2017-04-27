package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Mapping_ugom;
import com.gdaib.pojo.Mapping_ugomExample;
import org.apache.ibatis.annotations.Param;

public interface Mapping_ugomMapper {
    int countByExample(Mapping_ugomExample example);

    int deleteByExample(Mapping_ugomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mapping_ugom record);

    int insertSelective(Mapping_ugom record);

    List<Mapping_ugom> selectByExample(Mapping_ugomExample example);

    Mapping_ugom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mapping_ugom record, @Param("example") Mapping_ugomExample example);

    int updateByExample(@Param("record") Mapping_ugom record, @Param("example") Mapping_ugomExample example);

    int updateByPrimaryKeySelective(Mapping_ugom record);

    int updateByPrimaryKey(Mapping_ugom record);
}