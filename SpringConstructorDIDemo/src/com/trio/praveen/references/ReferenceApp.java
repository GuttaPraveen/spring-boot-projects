package com.trio.praveen.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ReferenceApp
{
	public static void main(String[] args) 
	{  
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\91891\\springboot\\SpringConstructorDIDemo\\ciobjects.xml");
		Customer cust=context.getBean("customer1",Customer.class);
		System.out.println(cust);
		System.out.println(cust.getUserId());
		System.out.println(cust.getMobile());
		
		CustomerAddress caddress = cust.getAddress();
		System.out.println(caddress.getCity());
		System.out.println(caddress.getPincode());
		System.out.println(caddress.getArea());
		
		AreaInfo area = caddress.getAreaInfo();
		System.out.println(area.getStreetName());
		System.out.println(area.getFlatName());
		
		
		
	}
}
