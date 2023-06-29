package com.security.security3.controllers;

import com.security.security3.beans.TestTable;
import com.security.security3.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TestService testService;

    @GetMapping("/get/{id}")
    public Optional<TestTable> get(@PathVariable int id)
    {
        return testService.getById(id);
    }

    @GetMapping("/getAll")
    public List<TestTable> getAll()
    {
        return testService.getAll();
    }

}
