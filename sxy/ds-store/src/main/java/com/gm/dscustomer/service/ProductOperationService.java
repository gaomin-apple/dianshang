package com.gm.dscustomer.service;

import com.gm.dscustomer.dto.out.ProductOperationOutDTO;

import java.util.List;

public interface ProductOperationService {
    void count(Integer productId);

    List<ProductOperationOutDTO> selectHotProduct();
}
