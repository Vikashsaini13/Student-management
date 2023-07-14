package com.example.Student.Management.service;

import com.example.Student.Management.model.Address;
import com.example.Student.Management.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "address added";
    }

    public Address getAddressById(Long id) {
        Optional<Address> address=addressRepo.findById(id);
        return address.get();
    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Address deleted";
    }

    public String updateAddress(Address address) {
        Address existingAddress= addressRepo.findById(address.getAddressId()).get();

        existingAddress.setLandmark(address.getLandmark());
        existingAddress.setZipcode(address.getZipcode());
        existingAddress.setDistrict(address.getDistrict());
        existingAddress.setState(address.getState());
        existingAddress.setCountry(address.getCountry());

        addressRepo.save(existingAddress);

        return "address updated successfully!!!!";
    }
}
