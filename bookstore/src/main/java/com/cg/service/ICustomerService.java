package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface ICustomerService {
	
	public int addCustomer(Customer customer);
	public List<Customer> showAllCustomer();
}
