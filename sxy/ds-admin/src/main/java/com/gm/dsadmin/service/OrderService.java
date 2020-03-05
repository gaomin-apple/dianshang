package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.dto.out.OrderListOutDTO;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);
}
