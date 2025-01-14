package com.shop.Tanmoy_Shop.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shop.Tanmoy_Shop.Service.ProductServices;

@Controller
public class HomeController {
	
	@Autowired
	ProductServices services;
	
	@GetMapping ("/")
	public String view_home_pages() {
		return "index";
	}
	
	@GetMapping ("/products")
	public String view_product_pages(Model model) {
		model.addAttribute("products", services.listAll());
		return "product";
	}

}
