package com.delta.rental.deltarental.services.rules;

import com.delta.rental.deltarental.entities.Color;
import com.delta.rental.deltarental.entities.Customer;
import com.delta.rental.deltarental.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerBusinessRules {
    private final CustomerRepository customerRepository;

    //DB içerisinde aynı Customer id' ye sahip customer olup olmama durumu kontrolü
    public Customer checkByCustomerId(int id){
        if(!(customerRepository.existsById(id))){
            throw new RuntimeException(id+" nolu id'ye sahip müşteri bulunmamaktadır.");
        }
        return customerRepository.findById(id).orElseThrow();
    }
}
