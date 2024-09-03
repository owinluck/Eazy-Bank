package com.example.EazyBank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contactDetails")
    public String getContatcDetails(){
        return "Contatc";
    }
}