package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trio.praveen.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> 
{

}
