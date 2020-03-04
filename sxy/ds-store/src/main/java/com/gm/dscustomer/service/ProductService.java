package com.gm.dscustomer.service;

import com.github.pagehelper.Page;
import com.gm.dscustomer.dto.out.ProductListOutDTO;
import com.gm.dscustomer.dto.out.ProductShowOutDTO;
import com.gm.dscustomer.po.Product;

public interface ProductService {
    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);
}
