package com.trio.praveen;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trio.praveen.entity.Person;
import com.trio.praveen.service.PersonService;

@SpringBootApplication
public class SpringJpaUsingDerivedMethodsApplication implements CommandLineRunner
{
	@Autowired
	private PersonService personService;

	public static void main(String[] args)
	{
		SpringApplication.run(SpringJpaUsingDerivedMethodsApplication.class, args);
	}

	public void run(String...args) throws Exception
	{
		List<Person> personList = Arrays.asList(
				      new Person(1240,"Praveen","Gutta",22,"praveen@gmail.com"),
				      new Person(1318,"Maha","pidikiti",20,"maha@gmail.com"),
				      new Person(1214,"Vani","Manam",18,"vani@gmail.com"));
		
		Iterable<Person> list = personService.savePersonData(personList);
		((Collection<Person>) list).stream().forEach(System.out::println);
	}
}
