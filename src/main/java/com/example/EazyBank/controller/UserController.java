package com.example.EazyBank.controller;

import com.example.EazyBank.model.Customer;
import com.example.EazyBank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        try {
            String hashPwd=passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashPwd);
            Customer saveCustomer = customerRepository.save(customer);

            if (saveCustomer.getId()>0){
                return ResponseEntity.status(HttpStatus.CREATED)
                        .body("Given user details are successfully registered");
            }else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("User registration failed");
            }
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occurred :"+ex.getMessage());
        }
    }
}
