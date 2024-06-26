package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
