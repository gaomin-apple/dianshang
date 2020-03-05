package com.gm.dsadmin.service.impl;

import com.gm.dsadmin.dao.AddressMapper;
import com.gm.dsadmin.po.Address;
import com.gm.dsadmin.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getByid(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}
