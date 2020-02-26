package com.gm.dsadmin.controller;

import com.gm.dsadmin.dto.in.CustomerSearchInDTO;
import com.gm.dsadmin.dto.out.CustomerListOutDTO;
import com.gm.dsadmin.dto.out.CustomerShowOutDTO;
import com.gm.dsadmin.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
