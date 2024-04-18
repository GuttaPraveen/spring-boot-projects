package com.trio.praveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Product;
import com.trio.praveen.entity.Stock;
import com.trio.praveen.model.ProductModel;
import com.trio.praveen.repository.ProductRepository;
import com.trio.praveen.repository.StockRepository;

@Service
public class ProductService
{
	@Autowired
    private ProductRepository productRepository;

    @Autowired
    private StockRepository stockRepository;

    public String saveProductWithStock(Product product, Stock stock)
    {
        product.setStock(stock);  // Associate the product with the stock

        // Save the stock (which cascades to product due to CascadeType.ALL)
        stockRepository.save(stock);

        // Save the product
        productRepository.save(product);
        
        return "Added Sucessfully";
    }

	public List<Product> getProductWithStock() 
	{
		// TODO Auto-generated method stub
		return productRepository.findAll();
		//return p.stream().map(ProductModel::new).collect(Collectors.toList());
	}
}
