package com.gm.dsadmin.controller;

import com.gm.dsadmin.dao.in.ProductCreateInDTO;
import com.gm.dsadmin.dao.in.ProductSearchInDTO;
import com.gm.dsadmin.dao.in.ProductUpdateInDTO;
import com.gm.dsadmin.dao.out.PageOutDTO;
import com.gm.dsadmin.dao.out.ProductListOutDTO;
import com.gm.dsadmin.dao.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){

    }

}
