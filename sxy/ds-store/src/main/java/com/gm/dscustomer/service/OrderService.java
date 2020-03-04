package com.gm.dscustomer.service;

import com.github.pagehelper.Page;
import com.gm.dscustomer.dto.in.OrderCheckoutInDTO;
import com.gm.dscustomer.po.Order;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);
    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

}
