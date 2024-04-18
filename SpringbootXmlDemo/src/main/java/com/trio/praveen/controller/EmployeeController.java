package com.trio.praveen.controller;

import java.util.Base64;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.trio.praveen.entity.Employee;
import com.trio.praveen.repository.EmployeeRepository;
import com.trio.praveen.request.EmployeeRequest;

@RestController
public class EmployeeController
{
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping("/process-xml")
	public String processXml(@RequestBody EmployeeRequest empReq)
	{
		//Jackson XML
		 XmlMapper xmlMapper = new XmlMapper();
	     Employee employee = xmlMapper.convertValue(empReq, Employee.class);
		/*Employee emp = new Employee();
        modelMapper.map(empReq, emp);*/
        employeeRepo.save(employee);

        List<Employee> empList = employeeRepo.findAll();

        String result = empList.stream()
                .map(Employee::toString)
                .reduce("", String::concat);

        System.out.println(result);

        String encodedPwd = Base64.getEncoder().encodeToString(result.getBytes());
        return encodedPwd;
	}
}
