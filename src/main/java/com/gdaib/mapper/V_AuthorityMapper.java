package com.gdaib.mapper;

import com.gdaib.pojo.V_Authority;
import com.gdaib.pojo.V_AuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface V_AuthorityMapper {
    int countByExample(V_AuthorityExample example);

    int deleteByExample(V_AuthorityExample example);

    int insert(V_Authority record);

    int insertSelective(V_Authority record);

    List<V_Authority> selectByExample(V_AuthorityExample example);

    int updateByExampleSelective(@Param("record") V_Authority record, @Param("example") V_AuthorityExample example);

    int updateByExample(@Param("record") V_Authority record, @Param("example") V_AuthorityExample example);
}