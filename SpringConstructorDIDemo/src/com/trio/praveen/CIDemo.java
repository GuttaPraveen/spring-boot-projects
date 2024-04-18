package com.trio.praveen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CIDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BeanFactory bf=new FileSystemXmlApplicationContext("C:\\Users\\91891\\springboot\\SpringConstructorDIDemo\\ci-beans.xml");
		
		//Parameterized and 3-arguments overloaded constructor
		Employee emp1=(Employee)bf.getBean("emp1");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getSalary());
		
		//Parameterized and 2-arguments overloaded constructor
		Employee emp2=(Employee)bf.getBean("emp2");
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getEmpName());
		
		//Default Constructor
		Employee emp3=(Employee)bf.getBean("emp3");
		System.out.println(emp3.getEmpId());
		System.out.println(emp3.getEmpName());

	}

}
