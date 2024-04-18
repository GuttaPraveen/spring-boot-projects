package com.trio.praveen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.trio.praveen.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	List<Employee> findByFirstName(@Param("firstName") String firstName);
}
