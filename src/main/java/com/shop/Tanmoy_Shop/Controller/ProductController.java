package com.shop.Tanmoy_Shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.Tanmoy_Shop.Model.Product;
import com.shop.Tanmoy_Shop.Service.ProductServices;

@Controller
public class ProductController {
	
	@Autowired
	ProductServices services;
	
	@PostMapping("/saveproducts")
	public String saveproduct(@ModelAttribute ("product") Product product) {
		services.save(product);
		return"redirect:/products";
	
	}
	
	@GetMapping("/newproduct")
	public String newproduct(Model model) {
		model.addAttribute("product", new Product());
		return"new_product";
	}
	
	 
    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        services.deleteProductById(id);
        return "redirect:/";
    }
    
 
    @GetMapping("/editProduct/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        Product product = services.getProductById(id);
        model.addAttribute("product", product);
        return "new_product";
    }
    
    

}
