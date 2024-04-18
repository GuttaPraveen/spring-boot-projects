package com.trio.praveen;

import java.util.ArrayList;
 
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.sound.sampled.TargetDataLine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trio.praveen.entity.Person;
import com.trio.praveen.service.PersonService;

@SpringBootApplication
public class SpringJpaUsingDerivedMethodsDemoApplication 
{
	@Autowired
	private PersonService personService;

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringJpaUsingDerivedMethodsDemoApplication.class, args);
	}
	public void run(String...args) throws Exception
	{
		createPersons();
		getPersons();
		findByLastName();
		findByLastNameOrFirstName();
		findByLastNameAndFirstName();
		findByLastNameOrderByCreatedDateDesc();
		//findByAgeLessThanEqual();
		//FindBtFirstNameLike();
		
	}
	private void createPersons()
	{
		List<Person> personList = Arrays.asList(
			      new Person(1240,"Praveen","Gutta",22,"praveen@gmail.com"),
			      new Person(1318,"Maha","pidikiti",20,"maha@gmail.com"),
			      new Person(1214,"Vani","Manam",18,"vani@gmail.com"));
	
	    Iterable<Person> list = personService.savePersonData(personList);
	    ((Collection<Person>) list).stream().forEach(System.out::println);
	}
	private void getPersons()
	{
		List<Integer> personList = new ArrayList<>();
		personList.add(1);
		personList.add(2);
		personList.add(3);
		personList.add(4);
		
	}
	private void findByLastName()
	{}
	private void findByLastNameOrFirstName()
	{
		Iterable<Person> personList = personService.findByLastNameOrFirstName("Gutta","Praveen");
		((Collection<Person>) personList).stream().forEach(System.out::println);
	}
	private void findByLastNameAndFirstName()
	{
		Person person = personService.findByLastNameAndFirstName("Gutta","Praveen");
		System.out.println("Person Object"+person.toString());
	}
	private void findByLastNameOrderByCreatedDateDesc()
	{
		Iterable<Person> personList = personService.findByLastNameByCreatedDateDesc("praveen");
		for(Person person : personList)
		{
			System.out.println("Pesron Object"+person.toString());
		}
	}
	private void findByFirstNameLike()
	{
		Iterable<Person> personList = personService.findByFirstNameLike("%praveen%");
			for(Person person : personList)
			{
				System.out.println("Pesron Object"+person.toString());
			}
			
	}
	private void findByCreatedDateBetweenWithTime()
	{
		Iterable<Person> personList = personService.findByCreatedDateBetween(getDateWithTime("2021-12-20 12:30:28"),getDateWithTime("2021-12-20 12:30:28"));
		for(Person person : personList)
		{
			System.out.println("Pesron Object"+person.toString());
		}
	}
	private void findByCreatedDateBetween()
	{
		Iterable<Person> personList = personService.findByCreatedDateBetween(getData("2021-12-20"),getDate("2021-12-20"));
		for(Person person : personList)
		{
			System.out.println("Pesron Object"+person.toString());
		}
	}
	

}
/*
1) Derived Methods

2) Named Query

3) Query

4) Native Query

		Derived Method - Spring BOOT JPA

If we want to retrieve the data apart from Primary Key column, then first approach will be the Derived Method appm Spring Boot automated this concept also. Developer can write only Abstract method ie., Only method signature with implementation (Only definition) and entire implementation will be taken care by Spring BOOT.

Logic: I need to follow some rules in the defining the method ->



 1) "findBy" keyword as prefix

2 I should the Property Name followed by Prefix

3) Entire Method Name should be in Camel Notation.

All above impleme retrieval

Ticket.java -> id,passengerName,sourceStation, destinationStation, travelDate, email-> all these properties.

Assuming that i want to fetch based on Passenger Name -> findByPassenger Name

public Ticket findByPassengerName(String passengerName) -> AbstractMethod-> ticket_table where passenger_name=passengerName -> It will give the result.
       Limitations of DerivedMethods

1) If we want to retrieve the data from multiple tables -> we can't achieve

2) If we want to fetch few columns not all columns in table -> we can't achieve

3) Always method names should be concise and if our business expression lengthy -> it may not fit

4) Need to remember rules -> "findBy" + columnNamec+cOperators + Camel Case ...> I can't write our custom way. Need to adhere the rules given by framework.

5) Aggregating functions will not work.




Named Query

1) Writing custom query and writing the name to this query. Why we need to write?

2)Query implementation at POJO Class and definition in the interface.

Just like how we wrote abstract method in the interface, same way named query also have an abstract method but implementation will be at POJO class level.


For Normal CRUD Operations like Create, Read, Update and Delete operations -> Developer no need to write any abstract method and no implemenation required.

For Devived methods, we need to write only abstract method > No implementation required> Framework will implement based on the methodName.

For Named query-> Developer need to write abstract method and implementation -> Abstract Method at 40 layer and implementation at POJO (model layer)

For Query and Native Query -> Developer need to write abstract method and implementation -> Abstract method an implemenation both at DAO Layer.






*/
