package com.example.Student.Management.repository;

import com.example.Student.Management.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Repeatable;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
