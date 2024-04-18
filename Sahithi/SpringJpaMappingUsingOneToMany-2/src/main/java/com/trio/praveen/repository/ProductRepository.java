package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
