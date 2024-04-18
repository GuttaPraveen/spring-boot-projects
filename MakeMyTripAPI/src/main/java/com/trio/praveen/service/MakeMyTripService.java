package com.trio.praveen.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.trio.praveen.entity.Passenger;
import com.trio.praveen.entity.Ticket;

@Service
public class MakeMyTripService
{
	public Ticket bookTicket(Passenger passenger)
	{
		String apiUrl = "http://43.205.144.253:8080/ticket";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> ticket=restTemplate.postForEntity(apiUrl,passenger,Ticket.class);
		return ticket.getBody();
		
	}

	public List<Ticket> getAllTickets()
	{
		String apiUrl="http://localhost:8080/tickets";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket[]> forEntity=rt.getForEntity(apiUrl, Ticket[].class);
		Ticket[] body= forEntity.getBody();
		List<Ticket> tickets = Arrays.asList(body);
		
		return tickets;
	}
}
