package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.po.Return;

public interface ReturnService {
    Page<Return> search(Integer pageNum);
}
