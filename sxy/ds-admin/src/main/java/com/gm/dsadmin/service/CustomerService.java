package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.po.Customer;

public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);
}
