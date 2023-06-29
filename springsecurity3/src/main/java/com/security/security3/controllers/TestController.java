package com.security.security3.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user")
    public ResponseEntity<String> getData()
    {
        return ResponseEntity.status(200).body("<--->User's Data<--->");
    }

    @GetMapping("/get-secured-data")
    public ResponseEntity<String> getSecuredData()
    {
        return ResponseEntity.status(200).body("<--->Secured Data !!!<--->");
    }

    @PostMapping("/logged-in")
    public ResponseEntity<String> loggedIn()
    {
        return ResponseEntity.status(200).body("<--->Logged in successfully !!!<--->");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminData()
    {
        return ResponseEntity.status(200).body("<--->Admin's Data !!!<--->");
    }

}
