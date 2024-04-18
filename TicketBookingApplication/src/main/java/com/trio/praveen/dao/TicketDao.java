package com.trio.praveen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.trio.praveen.entity.*;
@Repository
//It will establish a database connection if does not exist
//Frame  work automated SessionFactory / EntityManagerFactory, Transaction factory e.t.c for Database

public interface TicketDao extends CrudRepository<Ticket,Integer>
{
	//CRUD OPERATION ==> CREATE READ UPDATE DELETE
	//Two inputs are required ==> 1)Model class name    2) datatype of PK.
	
	//Insert the data ==> INSERT INTO TB1_TICKET
	
	//Update the data ==>UPDATE TB1_TICKET
	
	//retrieve the date ==>SELECT * FROM TB1_TICKET
	//delete the date ==>DELETE FROM TB1_TICKET
	
	//Derived Methods ==>Developer need to write abstract method and FW will implement based on abstract method
	//For abstract method ==> Input and output can be developer choice but method name can be having some rules...
	//	   1. "findfindBy" keyword as prefix
	//	   2. Should the property Name followed bt Prefix
	//     3. Entire Method name should be CamelCase Notation

	//Need to write a method which will look data based on passangerName
	//Framework will implement for this abstract method
	
	public Iterable<Ticket> findByPassengerName(String passengerName);
}
