package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cusService;

	@PostMapping("/saverr")
	public void saveCusss(@RequestBody Customer c) {
		cusService.saveCuss(c);
	}

	@GetMapping("/findd")
	public void finddd() {
		cusService.findd();
	}

	@PutMapping("/uppdate")
	public void updateee(@RequestBody Customer c) {
		cusService.updatee(c);
	}

	@DeleteMapping("/delette")
	public void deleteEmp(@RequestBody Customer c) {
		cusService.delete(c);
	}
}
