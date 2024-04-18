package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

}
