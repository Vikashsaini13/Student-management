package com.example.Student.Management.service;

import com.example.Student.Management.model.Book;
import com.example.Student.Management.model.Laptop;
import com.example.Student.Management.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop saved";
    }

    public Laptop getLaptopById(Long id) {
        return laptopRepo.findById(id).get();
    }

    public String deleteLaptopById(Long id) {
        laptopRepo.deleteById(id);
        return  "laptop deleted";
    }

    public String updateLaptop(Laptop laptop) {
        Laptop existingLaptop =laptopRepo.findById(laptop.getLaptopId()).get();

        existingLaptop.setLaptopName(laptop.getLaptopName());
        existingLaptop.setLaptopBrand(laptop.getLaptopBrand());
        existingLaptop.setLaptopPrice(laptop.getLaptopPrice());

        laptopRepo.save(existingLaptop);

        return "laptop updated successfully!!!!";

    }
}
