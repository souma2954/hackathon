package com.soumadeep.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumadeep.customer.entity.Customer;
import com.soumadeep.customer.service.CustomerService;

@RestController
@RequestMapping("/customer-service")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		Customer customerResponse = service.createCustomer(customer);
		return customerResponse;
	}
	
	@GetMapping("customers/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customerResponse = service.getCustomerById(customerId);
		return customerResponse;
	}
	
	@GetMapping("customers/")
	public List<Customer> getAllCustomer() {
		List<Customer> customers = service.getAllCustomer();
		return customers;
	}
	
	
	@PutMapping("customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		Customer customerResponse = service.updateCustomer(customer);
		return customerResponse;
	}
	
	@DeleteMapping("customers/{customerId}")
	public boolean deletCustomer(@PathVariable int customerId) {
		Customer customerResponse = service.getCustomerById(customerId);
		if(customerResponse !=null) {
			return service.deleteCustomer(customerId);
		}else return false;
		
	}
	
	
}
