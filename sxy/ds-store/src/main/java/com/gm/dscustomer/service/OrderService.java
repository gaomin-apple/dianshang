package com.gm.dscustomer.service;

import com.gm.dscustomer.dto.in.OrderCheckoutInDTO;

public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);
}
