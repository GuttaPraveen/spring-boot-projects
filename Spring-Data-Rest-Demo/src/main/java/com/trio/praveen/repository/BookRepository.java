package com.trio.praveen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.trio.praveen.entity.Book;

@RepositoryRestResource(path="books")
public interface BookRepository extends JpaRepository<Book,Integer> 
{
	public List<Book> findByName(@Param("name") String name);
}

/*
 
 		=> It is used to simplify REST API development

			RestController + JpaRepository = RestRepository


		1) Create Spring starter project with below dependencies

				a) rest-repositories (data-rest)
				b) data-jpa
				c) mysql-connector-j
				d) devtools
				
				
		GET:http://localhost:9090/books
		POST:http://localhost:9090/books
				{
    				"id": 101,
    				"name": "Java",
    				"price": 2500.20
				}
				
		GET:http://localhost:9090/books/search/findByName?name=Java
 		
*/