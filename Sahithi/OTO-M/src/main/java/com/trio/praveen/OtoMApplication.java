package com.trio.praveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.trio.praveen.service.PersonService;

@SpringBootApplication
public class OtoMApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(OtoMApplication.class, args);
		
		PersonService personService = context.getBean(PersonService.class);
		
		personService.saveData();
		//personService.delete();
	}

}
