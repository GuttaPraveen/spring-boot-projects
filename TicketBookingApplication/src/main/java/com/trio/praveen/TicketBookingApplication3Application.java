package com.trio.praveen;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trio.praveen.entity.Ticket;
import com.trio.praveen.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication3Application implements CommandLineRunner
{
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args)
	{
		SpringApplication.run(TicketBookingApplication3Application.class, args);
	}
	public void run(String... args) throws Exception
	{
		//When ever we run our spring boot application ==> Run method will 
		//Generally in real time we use this for static data purpose
		Ticket ticket = new Ticket();
		ticket.setPassengerName("Praveen");
		ticket.setSourceStation("Hyderabad");
		ticket.setDestinationStation("Vijayawada");
		ticket.setEmail("praveen@gmail.com");
		ticket.setTravelDate(new Date());
		ticketService.createTicket(ticket);
	}

}
