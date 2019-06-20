package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Category;
import com.cg.service.ICategoryService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class CategoryController {

	@Autowired
	ICategoryService catservice;

	public ICategoryService getCatservice() {
		return catservice;
	}

	public void setCatservice(ICategoryService catservice) {
		this.catservice = catservice;
	}
	
	@PostMapping("/addCategory")
	public int addBook(@RequestBody Category category)
	{
		return catservice.addCategory(category);
	}
}
