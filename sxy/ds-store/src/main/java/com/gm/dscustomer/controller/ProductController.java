package com.gm.dscustomer.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.gm.dscustomer.dto.in.ProductSearchInDTO;
import com.gm.dscustomer.dto.out.PageOutDTO;
import com.gm.dscustomer.dto.out.ProductListOutDTO;
import com.gm.dscustomer.dto.out.ProductOperationOutDTO;
import com.gm.dscustomer.dto.out.ProductShowOutDTO;
import com.gm.dscustomer.mq.HotProductDTO;
import com.gm.dscustomer.service.ProductOperationService;
import com.gm.dscustomer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    private ProductOperationService productOperationService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum) {
        Page<ProductListOutDTO> page = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId) {
        ProductShowOutDTO productShowOutDTO = productService.getShowById(productId);
        HotProductDTO hotProductDTO = new HotProductDTO();
        hotProductDTO.setProductId(productId);
        hotProductDTO.setProductCode(productShowOutDTO.getProductCode());
        kafkaTemplate.send("hotproduct", JSON.toJSONString(hotProductDTO));
        return productShowOutDTO;
    }

    @GetMapping("/hot")
    public List<ProductOperationOutDTO> hot(){

        String hotProductsJson = redisTemplate.opsForValue().get("HotProducts");
        if (hotProductsJson != null){
            List<ProductOperationOutDTO> productOperations = JSON.parseArray(hotProductsJson, ProductOperationOutDTO.class);
            return productOperations;
        }else {
            List<ProductOperationOutDTO> hotProducts = productOperationService.selectHotProduct();
            redisTemplate.opsForValue().set("HotProducts",JSON.toJSONString(hotProducts));
            return hotProducts;
        }
    }
}
