package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Operate;
import com.gdaib.pojo.OperateExample;
import org.apache.ibatis.annotations.Param;

public interface OperateMapper {
    int countByExample(OperateExample example);

    int deleteByExample(OperateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operate record);

    int insertSelective(Operate record);

    List<Operate> selectByExample(OperateExample example);

    Operate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByExample(@Param("record") Operate record, @Param("example") OperateExample example);

    int updateByPrimaryKeySelective(Operate record);

    int updateByPrimaryKey(Operate record);
}