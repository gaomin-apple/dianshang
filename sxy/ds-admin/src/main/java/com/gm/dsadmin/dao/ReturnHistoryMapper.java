package com.gm.dsadmin.dao;

import com.gm.dsadmin.po.ReturnHistory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);

    //    custom
    List<ReturnHistory> selectListByReturnId(@Param("returnId") Integer returnId);
}