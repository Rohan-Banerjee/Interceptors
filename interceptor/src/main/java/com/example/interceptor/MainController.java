package com.example.interceptor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/products")
	public List<String> getProducts()
	{
		final List<String> products = new ArrayList<>();
		products.add("hammer");
		products.add("pencil");
		
		return products;
	}
}
