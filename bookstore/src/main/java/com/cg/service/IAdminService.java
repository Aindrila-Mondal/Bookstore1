package com.cg.service;

import java.util.List;

import com.cg.exception.BookstoreException;
import com.cg.model.Admin;

public interface IAdminService {
	
	public int addAdmin(Admin admin);
	boolean updateAdmin(int aId, Admin admin);
	public List<Admin> showAdmin() throws BookstoreException;
	public boolean deleteAdmin(int aId) throws BookstoreException;
}
