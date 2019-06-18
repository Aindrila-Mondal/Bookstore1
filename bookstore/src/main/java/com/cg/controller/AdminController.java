package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Admin;
import com.cg.service.IAdminService;

@RestController
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
	@PostMapping("/{aId}")
	public boolean updateAdmin(@PathVariable("aId") int aId,@RequestBody Admin admin) {
		return adminservice.updateAdmin(aId,admin);
		
	}
	@GetMapping("/showAdmin")
	public List<Admin> showAdmin()
	{
		return adminservice.showAdmin();
		
	}
	@GetMapping("/deleteAdmin/{aId}")
	public boolean deleteAdmin(@PathVariable("aId") int aId)
	{
		return adminservice.deleteAdmin(aId) ;
		
	}
}
