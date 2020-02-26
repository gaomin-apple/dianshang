package com.gm.dscustomer.controller;

import com.gm.dscustomer.dao.in.ProductSearchInDTO;
import com.gm.dscustomer.dao.out.PageOutDTO;
import com.gm.dscustomer.dao.out.ProductListOutDTO;
import com.gm.dscustomer.dao.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }

}
