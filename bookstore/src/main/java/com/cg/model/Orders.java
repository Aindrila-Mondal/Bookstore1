package com.cg.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Order_l")
public class Orders implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cust1", sequenceName = "Ord1", initialValue = 1, allocationSize = 1)
	private int orderId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Customer")
	private Customer customer;

	@OneToMany
	private List<Book> book;

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	private String orderedStatus;

	private String streetAddress;

	private String city;

	private String zipCode;

	private String country;

	private String paymentMethod;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderedStatus() {
		return orderedStatus;
	}

	public void setOrderedStatus(String orderedStatus) {
		this.orderedStatus = orderedStatus;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Orders() {
		super();
		System.out.println("order");
	}

}
