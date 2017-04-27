package com.gdaib.mapper;

import java.util.List;

import com.gdaib.pojo.File_info;
import com.gdaib.pojo.File_infoExample;
import org.apache.ibatis.annotations.Param;

public interface File_infoMapper {
    int countByExample(File_infoExample example);

    int deleteByExample(File_infoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(File_info record);

    int insertSelective(File_info record);

    List<File_info> selectByExample(File_infoExample example);

    File_info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") File_info record, @Param("example") File_infoExample example);

    int updateByExample(@Param("record") File_info record, @Param("example") File_infoExample example);

    int updateByPrimaryKeySelective(File_info record);

    int updateByPrimaryKey(File_info record);
}