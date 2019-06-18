package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IAdminDao;
import com.cg.model.Admin;

@Service
@Transactional
public class IAdminServiceImpl implements IAdminService
{

	@Autowired
	  IAdminDao adminrepo;

	@Override
	public boolean updateAdmin(int aId, Admin admin) {
		// TODO Auto-generated method stub
		boolean flag=false;
    	Admin ad1=adminrepo.getOne(aId);
    	
    	if(admin!=null)
    	{
    		ad1.setAdminId(admin.getAdminId());
    		ad1.setAdminName(admin.getAdminName());
    		ad1.setEmail(admin.getEmail());
    		ad1.setPassword(admin.getPassword());
    		//cust.setCustomerAddresses(customer.getCustomerAddresses());
    		adminrepo.save(ad1);
    		System.out.println("@@@@@@@@@@@@@@@@@@"+ad1);
    		flag=true;
    	}
	return flag;
	
	}

	@Override
	public int addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminrepo.save(admin);
		return admin.getAdminId();
	}

	@Override
	public List<Admin> showAdmin() {
		// TODO Auto-generated method stub
		List<Admin> adminlist=adminrepo.findAll();
		return  adminlist;
	}

	@Override
	public boolean deleteAdmin(int aId) {
		// TODO Auto-generated method stub
		boolean flag2=false;
    
 
    		
    		adminrepo.deleteById(aId);
    		System.out.println("@@@@@@@@@@@@@@@@@@");
    		flag2=true;
    	
	return flag2;
	
		
	}
	  
	
	
	
	

}
