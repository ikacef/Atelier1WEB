package moncef.backend.controller;

import moncef.backend.model.Customer;
import moncef.backend.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moncef")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerRepo repository;



    @GetMapping("/getallcustomers")
    public List<Customer> getAll(){
        return repository.findAll();
    }

    @PostMapping("/createcustomer")
    public Customer addNewCustomer(@RequestBody Customer customer){
        repository.save(customer);
        return customer;

    }
}
