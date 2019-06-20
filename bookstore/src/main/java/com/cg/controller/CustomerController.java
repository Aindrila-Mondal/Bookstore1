package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.service.ICustomerService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class CustomerController {

	@Autowired
	ICustomerService  customerservice;

	public ICustomerService getCustomerservice() {
		return customerservice;
	}

	public void setCustomerservice(ICustomerService customerservice) {
		this.customerservice = customerservice;
	}
	
	@PostMapping("/addCustomer")
	public int addCustomer(@RequestBody Customer customer)
	{
		return customerservice.addCustomer(customer);
	}
	@GetMapping("/showCustomer")
	public List<Customer> showCustomer()
	{
		return customerservice.showAllCustomer();
		
	}
}
