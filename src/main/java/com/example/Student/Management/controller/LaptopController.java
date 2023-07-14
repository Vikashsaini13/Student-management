package com.example.Student.Management.controller;

import com.example.Student.Management.model.Book;
import com.example.Student.Management.model.Laptop;
import com.example.Student.Management.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    //add laptop
    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    //get laptop by
    @GetMapping("laptop/id/{id}")
    public Laptop getLaptopById(@PathVariable Long id){
        return laptopService.getLaptopById(id);
    }


    //delete Laptop by id
    @DeleteMapping ("laptop/id/{id}")
    public String deleteLaptopById(@PathVariable Long id){
        return laptopService.deleteLaptopById(id);
    }


    //update laptop
    @PutMapping("laptop")
    public String updateLaptop(@RequestBody Laptop laptop){
        return laptopService.updateLaptop(laptop);
    }
}
