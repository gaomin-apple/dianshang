package com.gm.dscustomer.controller;

import com.gm.dscustomer.dto.in.ProductSearchInDTO;
import com.gm.dscustomer.dto.out.PageOutDTO;
import com.gm.dscustomer.dto.out.ProductListOutDTO;
import com.gm.dscustomer.dto.out.ProductShowOutDTO;
import com.gm.dscustomer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getShowById(productId);
        return productShowOutDTO;
    }

}
