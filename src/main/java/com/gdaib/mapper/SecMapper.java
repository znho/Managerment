package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.Sec;
import com.gdaib.pojo.SecExample;
import org.apache.ibatis.annotations.Param;

public interface SecMapper {
    int countByExample(SecExample example);

    int deleteByExample(SecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sec record);

    int insertSelective(Sec record);

    List<Sec> selectByExample(SecExample example);

    Sec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sec record, @Param("example") SecExample example);

    int updateByExample(@Param("record") Sec record, @Param("example") SecExample example);

    int updateByPrimaryKeySelective(Sec record);

    int updateByPrimaryKey(Sec record);
}