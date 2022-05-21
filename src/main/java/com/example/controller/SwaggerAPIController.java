package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerAPIController {

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	
	public List<String> getProducts() {
		List<String> productList = new ArrayList<>();
		productList.add("Pista");
		productList.add("Badam");
		return productList;
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String createProduct() {
		return "Product is saved successfully";
	}

}
