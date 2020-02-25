package com.gm.dsadmin.controller;

import com.gm.dsadmin.dao.in.Account;
import com.gm.dsadmin.dao.in.AdministratorLogin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController123 {

    @GetMapping("/login")
    public String login(AdministratorLogin administratorLogin){
        return null;
    }

    @GetMapping("/getProfile")
    public String getProfile(){
        return null;
    }

    @PostMapping("/updateProfile")
    public String updateProfile(Account account){
        return null;
    }

    @GetMapping("/list")
    public String list(){
        return null;
    }

    @GetMapping("/show")
    public String show(Integer accountid){
        return null;
    }

    @PostMapping("/create")
    public String create(){
        return  null;
    }
    @PostMapping("/update")
    public  String update(Account account){
        return  null;
    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(String username){
        return null;
    }

    @PostMapping("/resetPwd")
    public String resetPwd(Account account){
        return null;
    }

    @PostMapping("/imageupload")
    public String imageupload(){
        return null;
    }

    @GetMapping("/productlist")
    public String productlist(){
        return null;
    }

    @PostMapping("/productadd")
    public String productadd(Account account){
        return null;
    }

    @GetMapping("/productshow")
    public String productshow(Integer productid){
        return null;
    }

    @PostMapping("/productupdate")
    public String productupdate(Account account){
        return null;
    }

    @GetMapping("/ordersearch")
    public String ordersearch(){
        return null;
    }

    @GetMapping("/ordershow")
    public String ordershow(Integer orderid){
        return null;
    }

    @PostMapping("/orderhistoryadd")
    public String orderhistoryadd(Account account){
        return null;
    }

    @GetMapping("/invoiceinfoshow")
    public String invoiceinfoshow(Integer id){
        return null;
    }

    @GetMapping("/shipinfoshow")
    public String shipinfoshow(){
        return null;
    }

    @GetMapping("/returnsearch")
    public String returnsearch(){
        return null;
    }

    @GetMapping("/returnshow")
    public String returnshow(){
        return null;
    }

    @PostMapping("/returnactionupdate")
    public String returnactionupdate(){
        return null;
    }

    @PostMapping("/returnhistory create")
    public String returnhistorycreate(){
        return null;
    }
}
