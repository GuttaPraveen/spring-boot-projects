package com.trio.praveen.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.dao.PersonDao;
import com.trio.praveen.entity.Person;

@Service
public class PersonService
{
	@Autowired
	private PersonDao personDao;
	
	
	//SaveAll() ==> Save Collection Of Entities 
	public Iterable<Person> savePersonData(Iterable<Person> persons)
	{
		return personDao.saveAll(persons);
	}
	public Iterable<Person> getPesronData(Iterable<Integer> personIds)
	{
		return personDao.findAllById(personIds);
	}
    public Iterable<Person> findByLastName(String lastName)
    {
    	return personDao.findByLastName(lastName);
    }
	public Person findByLastNameAndFirstName(String lastName,String fisrtName)
	{
		return personDao.findByLastNameAndFirstName(lastName,fisrtName);
	}
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName,String fisrtName)
	{
		return personDao.findByLastNameOrFirstName(lastName,fisrtName);
	}
	public Iterable<Person> findByLastNameByCreatedDateDesc(String lastName)
	{
		return personDao.findByLastNameByCreatedDateDesc(lastName);
	}
	
	public Iterable<Person> findByAgeLessThanEqual(int age)
	{
		return personDao.findByAgeLessThanEqual(age);
	}
	
	public Iterable<Person> findByFirstNameLike(String firstName)
	{
		return personDao.findByFirstNameLike(firstName);
	}
	
	public Iterable<Person> findByLastNameAndAgeLessThanEqual(String lastName,int age)
	{
		return personDao.findByLastNameAndAgeLessThanEqual(lastName,age);
	}  
	
	public Iterable<Person> findByCreatedDateBetween(Date startDate,Date endDate)
	{
		return personDao.findByCreatedDateBetween(startDate, endDate);
	}
}
