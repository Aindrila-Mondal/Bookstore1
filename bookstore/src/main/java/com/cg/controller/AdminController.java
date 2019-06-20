package com.cg.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.BookstoreException;

import com.cg.model.Admin;
import com.cg.service.IAdminService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class AdminController {

	@Autowired
	IAdminService  adminservice;
	
	
	
	public IAdminService getAdminservice() {
		return adminservice;
	}
	public void setAdminservice(IAdminService adminservice) {
		this.adminservice = adminservice;
	}
	@PostMapping("/addAdmin")
	public int addAdmin(@RequestBody Admin admin)
	{
		return adminservice.addAdmin(admin);
	}
	@PutMapping("/updateAdmin/{aId}")
	public boolean updateAdmin(@PathVariable("aId") int aId,@RequestBody Admin admin) {
		
		System.out.println(" ############## update ##### ");
		return adminservice.updateAdmin(aId,admin);
		
	}
	@GetMapping("/showAdmin")
	public List<Admin> showAdmin()
	{
		try {
			List<Admin> users=adminservice.showAdmin();
			Collections.sort(users);
			return users;
			}
		catch(BookstoreException e)
		{
			return null;
		}
		
		
	}
	@DeleteMapping("/deleteAdmin/{aId}")
	public boolean deleteAdmin(@PathVariable("aId") int aId)
	{
		try {
			return adminservice.deleteAdmin(aId) ;
		}
		catch(BookstoreException e)
		{
			return false;
		}
		
	}
}
