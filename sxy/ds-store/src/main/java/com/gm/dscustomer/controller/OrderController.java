package com.gm.dscustomer.controller;

import com.gm.dscustomer.dao.in.OrderCheckoutInDTO;
import com.gm.dscustomer.dao.out.OrderListOutDTO;
import com.gm.dscustomer.dao.out.OrderShowOutDTO;
import com.gm.dscustomer.dao.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
