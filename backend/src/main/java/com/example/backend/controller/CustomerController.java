package com.example.backend.controller;

import com.example.backend.exception.CustomerException;
import com.example.backend.model.Customer;
import com.example.backend.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prj") // Adresse Ip après le local host en mode
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/getallcustomer")
    public List<Customer> getAll(){
        return customerRepo.findAll();
    }

    @PutMapping("/customer/{id}")
    public Customer updateCustomer(@RequestBody Customer newOne, @PathVariable Long id) {
        return customerRepo.findById(id).map(customer -> {
            customer.setFname(newOne.getFname());
            customer.setLname(newOne.getLname());
            customer.setEmail(newOne.getEmail());

            return customerRepo.save(customer);
        }).orElseThrow(() -> new CustomerException(id));
    }


    @GetMapping("/customer/{id}") //LEARN PATH VARIABLE
    public Customer getCustomerById(@PathVariable Long id){
        return customerRepo.findById(id)
                .orElseThrow(() -> new CustomerException(id));
    }

    @PostMapping("/addnewcustomer")
    public Customer createCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return customer;
    }



}
