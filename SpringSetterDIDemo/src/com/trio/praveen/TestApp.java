package com.trio.praveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestApp
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\91891\\springboot\\SpringSetterDIDemo\\config.xml");
		Student s=context.getBean("student",Student.class);
		System.out.println(s.getSid());
		System.out.println(s.getSname());
		System.out.println(s.getAddress().getCity());
		System.out.println(s.getAddress().getPinCode());
		System.out.println(s.getAddress().getCountry());
		

	}

}
