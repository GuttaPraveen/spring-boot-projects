package com.trio.praveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.dao.TicketDao;
import com.trio.praveen.entity.Ticket;

@Service
public class TicketService
{
	//We need to write our Business Logic in to this service Layer
	
	
	@Autowired
	private TicketDao ticketDao; //TicketDao ticketDao = new TicketDao();
	
	
	
	//create Ticket
	public Ticket createTicket(Ticket ticketObj)
	{
		return ticketDao.save(ticketObj);
		//Save is the CRUD Repository Implementation for inserting data or updating the data
		//ticketObj.ticketId  ==> null or not given ==> Insert the data
		//ticketObj.getTicketId() ==>100 ==> NOt there in the database ==> Insert the data
		//ticketObj.getTicketId() ==> Exists in the database ==>It will update the data
	}
	
	//Retrieve Ticket  
	public Iterable<Ticket> getAllTickets()
	{
		return ticketDao.findAll();
		//findAll ==> select * from tb1_ticket
		
	}
	//retrieve Ticket (not all tickets) 
	public Ticket getTicket(Integer ticketId)
	{
		return ticketDao.findById(ticketId).orElse(new Ticket());
	} 
	
	//Update Ticket
	public Ticket updateTicket(Integer ticketId,String newEmail)
	{
		//update tb1_ticket set email = newEmail where ticket_id = ticketId;
		Ticket dbTicketObj = getTicket(ticketId);
		dbTicketObj.setEmail(newEmail);
		return ticketDao.save(dbTicketObj);
	}
	//Delete Ticket   
	public void deleTicketById(Integer ticketId)
	{
		ticketDao.deleteById(ticketId);
		//deleteById ==> delete from tb1_ticket where ticket_id = ticketId;
	}
	
	public Iterable<Ticket> findByPassengerName(String passengerName)
	{
		return ticketDao.findByPassengerName(passengerName);
	}
}