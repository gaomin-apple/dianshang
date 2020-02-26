package com.gm.dsadmin.service;

import com.github.pagehelper.Page;
import com.gm.dsadmin.dto.in.ProductCreateInDTO;
import com.gm.dsadmin.dto.in.ProductUpdateInDTO;
import com.gm.dsadmin.dto.out.ProductListOutDTO;
import com.gm.dsadmin.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
