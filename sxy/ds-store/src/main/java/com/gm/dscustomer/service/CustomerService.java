package com.gm.dscustomer.service;

import com.gm.dscustomer.dto.in.CustomerRegisterInDTO;
import com.gm.dscustomer.po.Customer;

public interface CustomerService {
    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);
}
