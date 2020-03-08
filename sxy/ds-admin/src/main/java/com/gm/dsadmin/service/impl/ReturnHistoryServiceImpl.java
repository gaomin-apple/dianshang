package com.gm.dsadmin.service.impl;

import com.gm.dsadmin.dao.ReturnHistoryMapper;
import com.gm.dsadmin.po.ReturnHistory;
import com.gm.dsadmin.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {
    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectListByReturnId(returnId);
        return returnHistories;
    }

    @Override
    public Long create(ReturnHistory returnHistory) {
        returnHistoryMapper.insertSelective(returnHistory);
        Long returnHistoryId = returnHistory.getReturnHistoryId();
        return returnHistoryId;
    }
}
