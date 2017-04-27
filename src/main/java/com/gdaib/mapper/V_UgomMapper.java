package com.gdaib.mapper;

import com.gdaib.pojo.V_Ugom;
import com.gdaib.pojo.V_UgomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_UgomMapper {
    int countByExample(V_UgomExample example);

    int deleteByExample(V_UgomExample example);

    int insert(V_Ugom record);

    int insertSelective(V_Ugom record);

    List<V_Ugom> selectByExample(V_UgomExample example);

    int updateByExampleSelective(@Param("record") V_Ugom record, @Param("example") V_UgomExample example);

    int updateByExample(@Param("record") V_Ugom record, @Param("example") V_UgomExample example);
}