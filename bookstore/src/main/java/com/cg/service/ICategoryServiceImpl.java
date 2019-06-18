package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICategoryDao;
import com.cg.model.Category;
@Service
@Transactional
public class ICategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryDao categoryrepo;
	
	@Override
	public int addCategory(Category category) {
		categoryrepo.save(category);
		return category.getCategoryId();
		
	}

}
