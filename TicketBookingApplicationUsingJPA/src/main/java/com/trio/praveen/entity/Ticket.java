package com.trio.praveen.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //JPA will create a table with name as Ticket
@Table(name="tb1_ticket") //@Table is Optional
//If we want database table name with different name other than class name.
//create a table tb1_ticket1
public class Ticket
{
	/*
	 * CREATE TABLE TB1_TICKET(
	 * PASSENGER_NAME VARCHAR(30),
	 * TRAVEL_DATE DATETIME,
	 * SOURCE_STATION VARCHAR(30),
	 * DESTINATION_STATE VARCHAR(30),
	 * EMAIL VARCHAR(30),
	 * TICKETID PRIMARY KEY);
	 */
	//By default every property of the java class is a database column
	
	@Id //This will create primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	//AUTO ==> JPA WILL CREATE A DATABASE SEQUENCE TO DB AND IT WILL GENERATE VALUE USING SEQUENCE
	//IDENTITY ==> DATABASE ONLY WILL TAKE CARE OF SEQUENCE GENERATION AUTO_INCREMENT
	private Integer ticketId;
	
	@Column(name="passenger_name")
	//Column is also  optional. If we want database column value other than java property name
	private String passengerName;
	
	@Column(name="travel_date")
	private Date travelDate;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="destination_station")
	private String destinationStation;
	
	private String email;

	public Integer getTicketId()
	{
		return ticketId;
	}

	public void setTicketId(Integer ticketId)
	{
		this.ticketId = ticketId;
	}

	public String getPassengerName()
	{
		return passengerName;
	}

	public void setPassengerName(String passengerName) 
	{
		this.passengerName = passengerName;
	}

	public Date getTravelDate()
	{
		return travelDate;
	}

	public void setTravelDate(Date travelDate)
	{
		this.travelDate = travelDate;
	}

	public String getSourceStation() 
	{
		return sourceStation;
	}

	public void setSourceStation(String sourceStation)
	{
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation()
	{
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) 
	{
		this.destinationStation = destinationStation;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket(String passengerName, Date travelDate, String sourceStation,
			String destinationStation, String email)
	{
		super();
		
		this.passengerName = passengerName;
	  	this.travelDate = new Date();
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.email = email;
	}
	public Ticket() {}

	@Override
	public String toString() 
	{
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", travelDate=" + travelDate
				+ ", sourceStation=" + sourceStation + ", destinationStation=" + destinationStation + ", email=" + email
				+ "]";
	}
	
	
	
	
	
}
