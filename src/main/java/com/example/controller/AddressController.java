package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.Address;
import com.example.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addService;
	
	
	@PostMapping("/saaver")
	public void save(@RequestBody Address add) {
		addService.save(add);
	}

	@GetMapping("/addf")
	public List<Address> finddd() {
		return addService.findd();
	}
	
	@PutMapping("/addUp")
	public void updateee(@RequestBody Address add) {
		addService.updatee(add);
	}
	@DeleteMapping("/adddelete")
	public void deletee(@RequestBody Address add) {
		addService.delete(add);
	}
}
