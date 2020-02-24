package com.gm.dsadmin.controller;

import com.gm.dsadmin.dao.in.Account;
import com.gm.dsadmin.dao.in.AdministratorLogin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

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
}
