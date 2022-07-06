package com.example.bank.bank.admin;

import com.example.bank.bank.customer.Customer;
import com.example.bank.bank.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/admin")
public class AdminContrller {
 private final CustomerRepository customerRepository;

 @Autowired
 public AdminContrller( CustomerRepository customerRepository){
     this.customerRepository =customerRepository;
 }

 @PostMapping(path = "/customers/create")
  Customer createCustomer(@RequestBody Customer customer){

     customerRepository.insert(customer);
     return customer;
 }

 @GetMapping (path = "/customers")
     List<Customer> getCustomers(){
    return customerRepository.findAll();
 }

 @GetMapping (path = "/customers/{id}")
 Optional<Customer> getCustomer(@PathVariable String id){
     return customerRepository.findById(id);
 }

 @PutMapping(path= "/customers/{id}/update")
     Customer updateCustomer(@RequestBody Customer customer  ,@PathVariable String id){
    return customerRepository.findById(id).map(newCustomer->
    {
        newCustomer.setFirst_name(customer.getFirst_name());
        newCustomer.setLast_name(customer.getLast_name());
        newCustomer.setBirth_date(customer.getBirth_date());
        newCustomer.setGender(customer.getGender());
        newCustomer.setMobile(customer.getMobile());
        newCustomer.setPassword(customer.getPassword());
        return customerRepository.save(newCustomer);
    }).orElseGet(() -> {
        customer.setId(id);
        return customerRepository.save(customer);
    });

 }
}
