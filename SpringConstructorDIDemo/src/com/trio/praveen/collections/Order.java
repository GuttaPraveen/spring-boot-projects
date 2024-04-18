package com.trio.praveen.collections;

import java.util.List;
import java.util.Set;

public class Order
{
	private int orderId;
	private List<String> items;
	private double amount;
	private Set<Double> prices;
	public Order(int orderId, List<String> items, double amount)
	{
		super();
		this.orderId = orderId;
		this.items = items;
		this.amount = amount;
	}
	
	public Order(Set<Double> prices) 
	{
		super();
		this.prices = prices;
	}


	public int getOrderId()
	{
		return orderId;
	}
	
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	
	public List<String> getItems()
	{
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public Set<Double> getPrices() {
		return prices;
	}

	public void setPrices(Set<Double> prices) {
		this.prices = prices;
	}

	@Override
	public String toString()
	{
		return "Order [orderId=" + orderId + ", items=" + items + ", amount=" + amount + ", prices=" + prices + "]";
	}
	
	
	
}
