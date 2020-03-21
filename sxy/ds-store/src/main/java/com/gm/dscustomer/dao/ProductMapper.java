package com.gm.dscustomer.dao;

import com.github.pagehelper.Page;
import com.gm.dscustomer.dto.out.ProductListOutDTO;
import com.gm.dscustomer.po.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    //    custom
    Page<ProductListOutDTO> search();
}