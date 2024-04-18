package com.trio.praveen.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.trio.praveen.binding.Passenger;
import com.trio.praveen.binding.Ticket;

@Service
public class TicketServiceImpl implements TicketService
{
	Map<Integer,Ticket> map= new HashMap();
	
	@Override
	public Ticket bookingTicket(Passenger passenger)
	{
		// TODO Auto-generated method stub
		System.out.println("passenger ="+passenger);
		Ticket t = new Ticket();
		Random r = new Random();
		int id=r.nextInt(5);
		t.setTicketNum(id);
		BeanUtils.copyProperties(passenger,t);
		t.setStatus("CONFIRMED");
		map.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets()
	{
		// TODO Auto-generated method stub
		return map.values();
	}

}
