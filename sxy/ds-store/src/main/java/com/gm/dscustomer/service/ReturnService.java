package com.gm.dscustomer.service;

import com.github.pagehelper.Page;
import com.gm.dscustomer.po.Return;

public interface ReturnService {

    Integer create(Return aReturn);

    // custom
    Page<Return> getPageByCustomerId(Integer customerId,Integer pageNum);

    Return getById(Integer returnId);
}
