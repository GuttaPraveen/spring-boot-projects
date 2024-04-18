package com.trio.praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.Passenger;
import com.trio.praveen.entity.Ticket;
import com.trio.praveen.service.MakeMyTripService;

@RestController
public class MakeMyTripController
{
	@Autowired
	private MakeMyTripService makeMyTripService;
	
	@PostMapping("/ticket/book")
	public Ticket ticketBooking(Passenger p)
	{
		return makeMyTripService.bookTicket(p);
	}
	@GetMapping("/book-ticket")
	public List<Ticket> bookTicket() 
	{
		List<Ticket> allTickets=makeMyTripService.getAllTickets();
		return allTickets;
	}

	
}
