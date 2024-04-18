/**
 * 
 */
package com.trio.praveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trio.praveen.entity.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,String>
{

}
