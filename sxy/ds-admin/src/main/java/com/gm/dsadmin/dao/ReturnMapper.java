package com.gm.dsadmin.dao;

import com.github.pagehelper.Page;
import com.gm.dsadmin.po.Return;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);

    // custom
    Page<Return> search();
}