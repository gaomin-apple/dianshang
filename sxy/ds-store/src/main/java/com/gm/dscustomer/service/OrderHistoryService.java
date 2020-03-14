package com.gm.dscustomer.service;

import com.gm.dscustomer.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);
}
