package com.soumadeep.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.soumadeep.customer.entity.Customer;

@Service
public class CustomerService {
	
	public Customer createCustomer(Customer customer) { return null;}
	public Customer getCustomerById(int id) {return null;}
	public List<Customer> getAllCustomer(){return null;}
	public Customer updateCustomer(Customer customer) {return null;}
	public boolean deleteCustomer(int customerId) {return true;}
}
