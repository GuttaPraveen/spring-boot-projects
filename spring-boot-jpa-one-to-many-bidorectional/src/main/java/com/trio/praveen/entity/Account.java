package com.trio.praveen.entity;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Account
{
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String accountHolder;
	    private Double balance;

	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "bank_id")
	    private Bank bank;

	    
	    

}

