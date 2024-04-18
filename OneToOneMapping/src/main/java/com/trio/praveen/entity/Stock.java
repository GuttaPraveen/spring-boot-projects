package com.trio.praveen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stocks")
public class Stock
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;
    private int stockQuantity;
    @Enumerated(EnumType.STRING)
    private StockStatus stockStatus;
    
	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockQuantity=" + stockQuantity + ", stockStatus=" + stockStatus + "]";
	}
	
    
}