package com.example.Student.Management.controller;

import com.example.Student.Management.model.Address;
import com.example.Student.Management.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //add address
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    //get address by
    @GetMapping("address/id/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }


    //delete address by id
    @DeleteMapping ("address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }


    //update address
    @PutMapping("address")
    public String updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }
}
