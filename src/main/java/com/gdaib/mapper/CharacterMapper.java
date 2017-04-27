package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.CharacterExample;
import org.apache.ibatis.annotations.Param;

public interface CharacterMapper {
    int countByExample(CharacterExample example);

    int deleteByExample(CharacterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Character record);

    int insertSelective(Character record);

    List<Character> selectByExample(CharacterExample example);

    Character selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByExample(@Param("record") Character record, @Param("example") CharacterExample example);

    int updateByPrimaryKeySelective(Character record);

    int updateByPrimaryKey(Character record);
}