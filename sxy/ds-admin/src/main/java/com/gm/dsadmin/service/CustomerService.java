package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.dto.in.CustomerSearchInDTO;
import com.gm.dsadmin.dto.in.CustomerSetStatusInDTO;
import com.gm.dsadmin.po.Customer;

public interface CustomerService {
    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO ,Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
