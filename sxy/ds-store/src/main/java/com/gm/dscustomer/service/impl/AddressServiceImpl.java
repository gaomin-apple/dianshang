package com.gm.dscustomer.service.impl;

import com.gm.dscustomer.dao.AddressMapper;
import com.gm.dscustomer.po.Address;
import com.gm.dscustomer.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addresses = addressMapper.selectByCustomerId(customerId);
        return addresses;
    }

    @Override
    public Integer create(Address address) {
        addressMapper.insertSelective(address);
        Integer addressId = address.getAddressId();
        return addressId;
    }

    @Override
    public void update(Address address) {
        addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public void delete(Integer addressId) {
        addressMapper.deleteByPrimaryKey(addressId);
    }
}