package com.trio.praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.Customer;
import com.trio.praveen.repository.CustomerRepository;
import com.trio.praveen.repository.ProductRepository;
import com.trio.praveen.request.OrderRequest;

@RestController
public class OrderController
{
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/save")
	public Customer save(@RequestBody OrderRequest orderReq)
	{
		Customer cust = new Customer();
		return customerRepository.save(orderReq.getCustomer());
	}
	
	@GetMapping("get")
	public List<Customer> get()
	{
		return customerRepository.findAll();
	}
}
