package com.shop.Tanmoy_Shop.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.Tanmoy_Shop.Model.Product;
import com.shop.Tanmoy_Shop.Repository.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	
	ProductRepository repository;
	
	public List<Product> listAll(){
		return (List<Product>) repository.findAll();
	}
	
	public void save(Product product) {
		repository.save (product);
	}
	
	public void deleteProductById(Integer id) {
        repository.deleteById(id);
    }
	
	public Product getProductById(Integer id) {
        return repository.findById(id).orElse(null);
    }
	

	


}
