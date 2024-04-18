package com.trio.praveen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.dao.PersonDao;
import com.trio.praveen.entity.Person;

@Service
public class PersonService
{
	@Autowired
	private PersonDao personDao;
	
	public Iterable<Person> savePersonData(Iterable<Person> persons)
	{
		return personDao.saveAll(persons);
	}
	public Iterable<Person> getPesronData(Iterable<Integer> personIds)
	{
		return personDao.findAllById(personIds);
	}
}
