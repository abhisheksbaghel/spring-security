package com.security.security3.controllers;

import com.security.security3.beans.TestTable;
import com.security.security3.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TestService testService;

    @GetMapping("/getAll")
    public List<TestTable> getAll()
    {
        return testService.getAll();
    }

    @PostMapping("/save")
    public Optional<TestTable> save(@RequestBody TestTable testTable)
    {
        return testService.save(testTable);
    }

    @PutMapping("/update")
    public List<TestTable> update(@RequestBody TestTable testTable)
    {
        return testService.update(testTable);
    }

    @DeleteMapping("/delete/{id}")
    public Optional<TestTable> delete(@PathVariable int id)
    {
        return testService.deleteById(id);
    }

    @GetMapping("/get/{id}")
    public Optional<TestTable> get(@PathVariable int id)
    {
        return testService.getById(id);
    }


}
