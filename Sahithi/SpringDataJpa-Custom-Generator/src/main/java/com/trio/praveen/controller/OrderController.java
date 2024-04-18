package com.trio.praveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.OrderDetails;
import com.trio.praveen.repository.OrderRepository;

@RestController
public class OrderController
{
	private static int counter = 0;
    private static final String PREFIX = "OD";

	@Autowired
	private OrderRepository orderRepository;
	
	@PostMapping("/order")
	public ResponseEntity<?> saveOrderDtls(@RequestBody OrderDetails orderDtls)
	{
		OrderDetails ord= new OrderDetails();
		ord.setOrderId(generate());
		return  ResponseEntity.ok().body(orderRepository.save(orderDtls));
	}
	
	@GetMapping("/order")
	public ResponseEntity<?> getOrderDtls()
	{
		return  ResponseEntity.ok().body(orderRepository.findAll());
	}
	public static String generate()
	{
		
	        counter++;
	        String formattedCounter = String.format("%04d", counter); // Formats counter to have leading zeros if needed
	        return PREFIX + formattedCounter;
	}
	
}
