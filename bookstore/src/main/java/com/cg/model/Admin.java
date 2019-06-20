package com.cg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Admin implements Serializable, Comparable<Admin> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cust1", sequenceName = "Adm1", initialValue = 1, allocationSize = 1)
	private int adminId;

	private String adminName;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Column(unique = true)
	private String email;

	private String password;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(int adminId, String email, String adminName, String password) {
		super();
		this.adminName = adminName;
		this.adminId = adminId;
		this.email = email;
		this.password = password;
	}

	public Admin() {
		super();
		System.out.println("admin");
	}

	@Override
	public int compareTo(Admin o) {
		// TODO Auto-generated method stub
		return adminName.compareTo(o.adminName);
	}

	
}
