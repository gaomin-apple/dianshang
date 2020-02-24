package com.gm.dsproduct.controller;

import com.gm.dsproduct.dao.in.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/search")
    public String search(String productName,String Model,String quantity,Double price){
        return null;
    }

    @PostMapping("/addproduct")
    public String addproduct(Product product){
        return null;
    }

    @GetMapping("/findByAll")
    public String findByAll(){
        return null;
    }

    @GetMapping("/findByid")
    public String findByid(Integer productid){
        return null;
    }

    @GetMapping("/findlist")
    public String findlist(Integer accountid,Integer orderid){
        return null;
    }
}
