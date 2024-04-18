package com.trio.praveen.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.trio.praveen.binding.Passenger;
import com.trio.praveen.binding.Ticket;

@Service
public interface TicketService
{
	public Ticket bookingTicket(Passenger passenger);
	
	public Collection<Ticket> getAllTickets();
}
