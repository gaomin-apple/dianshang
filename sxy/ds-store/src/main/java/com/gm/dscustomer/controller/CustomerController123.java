package com.gm.dscustomer.controller;

import com.gm.dscustomer.dto.in.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController123 {

    @PostMapping("/register")
    public String register(Customer customer){
        return null;
    }

    @GetMapping("/login")
    public String login(String username,String password){
        return  null;
    }

    @GetMapping("/getprofile")
    public String customergetProfile(){
        return null;
    }

    @PostMapping("/updateprofile")
    public String customerupdateprofile(){
        return null;
    }
    @PostMapping("/changepassword")
    public String customerchangepassword(){
        return null;
    }

    @GetMapping("/getpwdrestcode")
    public String customergetpwdresetcode(){
        return null;
    }

    @PostMapping("/resetpwd")
    public String customerresetpwd(){
        return null;
    }

    @GetMapping("/addresslist")
    public String addresslist(){
        return null;
    }

    @PostMapping("/addressadd")
    public String addressadd(){
        return null;
    }

    @PostMapping("/addressupdate")
    public String addressupdate(){
        return null;
    }

    @PostMapping("/imageupload")
    public String imagepload(){
        return null;
    }

    @GetMapping("/productlist")
    public String productlist(){
        return null;
    }

    @GetMapping("/productshow")
    public String productshow(Integer id){
        return null;
    }

    @PostMapping("/ordercheckout")
    public String ordercheckout(){
        return null;
    }

    @GetMapping("/myorderlist")
    public String myorkerlist(){
        return null;
    }

    @GetMapping("/ordershow")
    public String ordershowhistory(Integer customerid){
        return null;
    }

    @PostMapping("/returnapply")
    public String returnapply(){
        return null;
    }

    @GetMapping("/returnlist")
    public String returnlist(){
        return null;
    }

    @GetMapping("/returnshow")
    public String returnshow(){
        return null;
    }
}
