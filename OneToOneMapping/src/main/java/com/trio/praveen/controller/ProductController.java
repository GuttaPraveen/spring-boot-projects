package com.trio.praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.Product;
import com.trio.praveen.entity.Stock;
import com.trio.praveen.model.ProductModel;
import com.trio.praveen.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody ProductModel productModel) 
	{
		
		Stock stock = new Stock();
		stock.setStockQuantity(productModel.getProduct().getStock().getStockQuantity());
		stock.setStockStatus(productModel.getProduct().getStock().getStockStatus());

		Product product = new Product();
		product.setProductName(productModel.getProduct().getProductName());
		product.setProductPrice(productModel.getProduct().getProductPrice());
		// Save product with stock
		
		return ResponseEntity.ok().body(productService.saveProductWithStock(product,stock));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Product>> getDetails()
	{
		return ResponseEntity.ok().body(productService.getProductWithStock());
	}
}
/*
//Request
 * 
{ 
  "product": 
  {
    	"productName": "RealMe",
    	"productPrice": 25000,
    	"stock": 
    	{
            "stockQuantity": 20,
            "stockStatus": "IN_STOCK"
         }
  }
}

//Response
[
  {
    "productId": 1,
    "productName": "iPad",
    "productPrice": 78000,
    "stock": {
      "stockId": 1,
      "stockQuantity": 40,
      "stockStatus": "IN_STOCK"
    }
  },
  {
    "productId": 2,
    "productName": "RealMe",
    "productPrice": 25000,
    "stock": {
      "stockId": 2,
      "stockQuantity": 20,
      "stockStatus": "IN_STOCK"
    }
  }
]
*/
