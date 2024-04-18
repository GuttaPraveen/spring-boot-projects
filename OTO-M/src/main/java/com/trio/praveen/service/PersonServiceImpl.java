package com.trio.praveen.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Passport;
import com.trio.praveen.entity.Person;
import com.trio.praveen.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService 
{

	@Autowired
	private PersonRepository personRepo;

	public void saveData() 
	{

		Person person = new Person();
		person.setPersonName("Praveen");
		person.setPersonGender("Male");

		Passport passport = new Passport();
		passport.setPassPortNum("KM797979");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));

		person.setPassport(passport);
		passport.setPerson(person);

		personRepo.save(person);

	}

	public void delete() {
		personRepo.deleteById(1);
	}

}
