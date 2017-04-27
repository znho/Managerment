package com.gdaib.mapper;

import com.gdaib.pojo.V_Person_info;
import com.gdaib.pojo.V_Person_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_Person_infoMapper {
    int countByExample(V_Person_infoExample example);

    int deleteByExample(V_Person_infoExample example);

    int insert(V_Person_info record);

    int insertSelective(V_Person_info record);

    List<V_Person_info> selectByExample(V_Person_infoExample example);

    int updateByExampleSelective(@Param("record") V_Person_info record, @Param("example") V_Person_infoExample example);

    int updateByExample(@Param("record") V_Person_info record, @Param("example") V_Person_infoExample example);
}