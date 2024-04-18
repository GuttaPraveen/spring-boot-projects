package com.trio.praveen.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trio.praveen.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Serializable>
{

}
