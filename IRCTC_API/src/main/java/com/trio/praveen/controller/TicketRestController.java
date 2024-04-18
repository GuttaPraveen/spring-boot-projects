package com.trio.praveen.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.binding.Passenger;
import com.trio.praveen.binding.Ticket;
import com.trio.praveen.service.TicketService;


@RestController
public class TicketRestController
{
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)
	{
		System.out.println("Entered");
		Ticket ticket = ticketService.bookingTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets()
	{
		 Collection<Ticket> allTickets=ticketService.getAllTickets();
		 return new ResponseEntity<>(allTickets,HttpStatus.OK);
	}
}
