package com.gm.dscustomer.controller;

import com.gm.dscustomer.dto.in.ProductSearchInDTO;
import com.gm.dscustomer.dto.out.PageOutDTO;
import com.gm.dscustomer.dto.out.ProductListOutDTO;
import com.gm.dscustomer.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
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
