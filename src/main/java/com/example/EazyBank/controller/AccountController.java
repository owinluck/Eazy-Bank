package com.example.EazyBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AccountController {
    @GetMapping("/myAccount")
    public String getAccountDetails(){
        return "My Account";
    }
}