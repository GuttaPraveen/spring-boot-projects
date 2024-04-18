package com.trio.praveen.dao;

import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import com.trio.praveen.entity.Person;
public interface PersonDao extends CrudRepository<Person,Integer>
{

	//Derived Methods
	
	public Iterable<Person> findByLastName(String lastName);
	
	public Person findByLastNameAndFirstName(String lastName,String fisrtName);
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName,String fisrtName);
	
	public Iterable<Person> findByLastNameByCreatedDateDesc(String lastName);
	
	public Iterable<Person> findByAgeLessThanEqual(int age);
	
	public Iterable<Person> findByFirstNameLike(String firstName);
	//select * from tbl_person where firstname like 'firstName'
	//Developer need to add %firstName% for wildcard each
	
	
	public Iterable<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age);
	
	public Iterable<Person> findByCreatedDateBetween(Date startDate,Date endDate);
	//select * from tbl_person where create_date between(startdate,endDate);
}
 