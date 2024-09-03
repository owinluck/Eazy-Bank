package com.example.EazyBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loan")
    public String getLoanDetails(){
        return "Loan";
    }
}