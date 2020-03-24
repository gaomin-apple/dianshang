package com.gm.dscustomer.service.impl;

import com.gm.dscustomer.dao.ProductOperationMapper;
import com.gm.dscustomer.dto.out.ProductOperationOutDTO;
import com.gm.dscustomer.po.ProductOperation;
import com.gm.dscustomer.service.ProductOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductOperationServiceImpl implements ProductOperationService {

    @Autowired
    private ProductOperationMapper productOperationMapper;

    @Override
    public void count(Integer productId) {
        ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);
        if (productOperation == null){
            productOperation = new ProductOperation();
            productOperation.setProductId(productId);
            productOperation.setAllCount(1);
            productOperation.setDayCount(1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.insertSelective(productOperation);
        }else {
            productOperation.setAllCount(productOperation.getAllCount()+1);
            productOperation.setDayCount(productOperation.getDayCount()+1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.updateByPrimaryKeySelective(productOperation);
        }
    }

    @Override
    public List<ProductOperationOutDTO> selectHotProduct() {
        List<ProductOperationOutDTO> hotProduct = productOperationMapper.selectHotProduct();
        return hotProduct;
    }
}
