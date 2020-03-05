package com.gm.dsadmin.service.impl;

import com.gm.dsadmin.dao.OrderHistoryMapper;
import com.gm.dsadmin.po.OrderHistory;
import com.gm.dsadmin.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderHistoryServiceImpl implements OrderHistoryService {
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }

    @Override
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
