package com.gdaib.mapper;

import com.gdaib.pojo.V_File_info;
import com.gdaib.pojo.V_File_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_File_infoMapper {
    int countByExample(V_File_infoExample example);

    int deleteByExample(V_File_infoExample example);

    int insert(V_File_info record);

    int insertSelective(V_File_info record);

    List<V_File_info> selectByExample(V_File_infoExample example);

    int updateByExampleSelective(@Param("record") V_File_info record, @Param("example") V_File_infoExample example);

    int updateByExample(@Param("record") V_File_info record, @Param("example") V_File_infoExample example);
}