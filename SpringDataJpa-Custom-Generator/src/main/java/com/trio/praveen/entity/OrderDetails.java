package com.trio.praveen.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;

//import java.util.Date;import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ORDR_DTLS")
public class OrderDetails
{
	@Id
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="ORDER_BY")
	private String orderBy;
	
	
	@CreationTimestamp
	@Column(name="ORDER_PLACED_DT",updatable = false)
	private Date orderPlacedDate;


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderBy() {
		return orderBy;
	}


	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}


	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}


	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlacedDate=" + orderPlacedDate
				+ "]";
	}
	
	
}
