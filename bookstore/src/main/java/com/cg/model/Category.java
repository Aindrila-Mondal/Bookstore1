package com.cg.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cust1", sequenceName = "Cate1", initialValue = 1, allocationSize = 1)
	private int categoryId;

	private String categoryName;

	
//	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//	@OneToMany(mappedBy = "category", targetEntity = Book.class)
//	@JsonManagedReference("book-category")
//	private List<Book> book;

//	public List<Book> getBook() {
//		return book;
//	}
//
//	public void setBook(List<Book> book) {
//		this.book = book;
//	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

//	public List<Book> getInventory() {
//		return book;
//	}
//
//	public void setInventory(List<Book> book) {
//		this.book = book;
//	}

	public Category(int categoryId, String categoryName, List<Book> book) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		//this.book = book;
	}

	public Category() {
		super();
		System.out.println("category");
	}

}
