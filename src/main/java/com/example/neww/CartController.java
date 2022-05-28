package com.example.neww;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

	@Qualifier("adult")
	@Autowired
	CartService adultCartService;

	@Qualifier("child")
	@Autowired
	CartService childCartService;

	@GetMapping("/adult")
	public String addCartt() {
		String resp = adultCartService.addCart();
		return resp;
	}

	@GetMapping("/child")
	public String getCart() {
		String resp = childCartService.addCart();
		return resp;
	}
	/*
	 * @GetMapping("/child") public String postCartt() { String resp =
	 * cartService.addCart(); return resp; }
	 */

}
