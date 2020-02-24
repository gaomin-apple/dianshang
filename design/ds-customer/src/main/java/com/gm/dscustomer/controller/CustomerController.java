package com.gm.dscustomer.controller;

import com.gm.dscustomer.dao.in.Address;
import com.gm.dscustomer.dao.in.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public String register(Customer customer){
        return null;
    }

    @GetMapping("/login")
    public String login(String username,String password){
        return  null;
    }

    @PostMapping("/changepassword")
    public String changepassword(){
        return null;
    }

    @PostMapping("/updateAccount")
    public String updateAccount(Customer customer){
        return null;
    }

    @PostMapping("/findByidAddress")
    public String findByidAddress(Integer accountid){
        return null;
    }

    @PostMapping("/addAddress")
    public  String addAddress(Address address){
        return  null;
    }
}
