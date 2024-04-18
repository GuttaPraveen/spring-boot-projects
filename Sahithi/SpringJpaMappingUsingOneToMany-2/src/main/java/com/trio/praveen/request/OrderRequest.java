package com.trio.praveen.request;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Customer;
import com.trio.praveen.entity.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class OrderRequest 
{
	private Customer customer;


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
