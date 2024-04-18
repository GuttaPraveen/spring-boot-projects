package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trio.praveen.entity.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> 
{

}
