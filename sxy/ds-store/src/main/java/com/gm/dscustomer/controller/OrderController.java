package com.gm.dscustomer.controller;

import com.gm.dscustomer.dto.in.OrderCheckoutInDTO;
import com.gm.dscustomer.dto.out.OrderListOutDTO;
import com.gm.dscustomer.dto.out.OrderShowOutDTO;
import com.gm.dscustomer.dto.out.PageOutDTO;
import com.gm.dscustomer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        Long orderId = orderService.checkout(orderCheckoutInDTO,customerId);
        return orderId;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum,@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
