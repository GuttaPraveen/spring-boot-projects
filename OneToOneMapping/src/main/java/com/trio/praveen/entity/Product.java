package com.trio.praveen.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String productName;

    private int productPrice;
    

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stock_id", referencedColumnName = "stockId")  // This means Foreign key will be created only in the Product table i.e. extra column 'stock_id' will be created in the Product table
    private Stock stock;
    
    /*
    @OneToOne annotation is used to define the one-to-one relationship.
    cascade = CascadeType.ALL specifies that all operations (e.g., persist, remove) should be cascaded to the associated Stock.
    @JoinColumn annotation specifies the foreign key column in the Product table that references the id column in the Stock table
    */

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
    
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", stock=" + stock + "]";
	}



    // Product-Stock One-To-One Unidirectional Relationship Mapping

    // With FetchType.LAZY and @ToString(exclude = "stock") at the entity Class level,
    // it will fetch the details of the Parent only i.e. Product


    // With FetchType.EAGER, it will fetch the details of the Child along with the Parent i.e.
    // both Stock and Product details
}

