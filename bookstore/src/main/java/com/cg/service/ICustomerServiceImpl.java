package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;

import com.cg.model.Customer;
@Service
@Transactional
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao customerepo;
	
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerepo.save(customer);
		return customer.getCustomerId();
	}
	

	@Override
	public List<Customer> showAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> customerlist=customerepo.findAll();
		return  customerlist;
	}

}
