package com.services.databaseservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String bookTitle;
	@Column
	private Integer quantity;
	@Column
	private String status;
	@Column
	private String approvedBy;
	@Column
	private String approvedDate;
	@Column
	private String returnDate;
	@Column
	private Integer daysToEpire;
	
	public Order() {
		super();
	}

	public Order(Integer id, String bookTitle, Integer quantity, String status, String approvedBy, String approvedDate,
			String returnDate) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.quantity = quantity;
		this.status = status;
		this.approvedBy = approvedBy;
		this.approvedDate = approvedDate;
		this.returnDate = returnDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getDaysToEpire() {
		return daysToEpire;
	}

	public void setDaysToEpire(Integer daysToEpire) {
		this.daysToEpire = daysToEpire;
	}

}
