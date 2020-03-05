package com.gm.dsadmin.service;

import com.gm.dsadmin.po.Address;

import java.util.List;

public interface AddressService {
    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);
}
