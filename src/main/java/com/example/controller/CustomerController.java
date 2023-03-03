package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class CustomerController {

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {

        model.addAttribute("customers", "testCustomer");
        model.addAttribute("username", "testUser");
        return "customers";
    }

}
