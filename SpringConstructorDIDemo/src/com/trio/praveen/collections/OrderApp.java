package com.trio.praveen.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class OrderApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context  = new FileSystemXmlApplicationContext("C:\\Users\\91891\\springboot\\SpringConstructorDIDemo\\ci-config.xml");
		Order ord = context.getBean("order",Order.class);
		System.out.println(ord);
		System.out.println(ord.getOrderId());
		System.out.println(ord.getItems());
		System.out.println(ord.getAmount());
		System.out.println("----------------");
		Order o = context.getBean("orderPrices",Order.class);
		System.out.println(o);
		System.out.println(o.getOrderId());
		System.out.println(o.getItems());
		System.out.println(o.getAmount());
		System.out.println(o.getPrices());
		
		
	}

}
