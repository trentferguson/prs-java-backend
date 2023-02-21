package com.tferguson.prsspringboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RequestLines")
public class RequestLine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "RequestID")
	private Request request;
	
	private int quantity;

	public RequestLine() {
	}

	public RequestLine(int id, Product product, Request request, int quantity) {
		this.id = id;
		this.product = product;
		this.request = request;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "RequestLine [id=" + id + ", product=" + product + ", request=" + request + ", quantity=" + quantity
				+ "]";
	}
	
	

}
