package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		
		customers.add(customer);
		
		return customers;
	}
}
