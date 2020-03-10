package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.dto.in.OrderSearchInDTO;
import com.gm.dsadmin.dto.out.OrderListOutDTO;
import com.gm.dsadmin.dto.out.OrderShowOutDTO;
import com.gm.dsadmin.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
