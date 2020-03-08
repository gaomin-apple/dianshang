package com.gm.dscustomer.service;

import com.gm.dscustomer.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {
    List<ReturnHistory> getByReturnId(Integer returnId);
}
