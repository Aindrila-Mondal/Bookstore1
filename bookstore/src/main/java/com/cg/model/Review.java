package com.cg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Review implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "cust1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "cust1", sequenceName = "revi1", initialValue = 1, allocationSize = 1)
	private int reviewId;

	@Min(1)
	@Max(5)
	private int rating;

	private String headLine;

	private String coment;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date reviewDate;

	@OneToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@OneToOne
	@JoinColumn(name = "bookId")
	private Book book;

	public Review() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public String getComment() {
		return coment;
	}

	public void setComment(String comment) {
		coment = comment;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
