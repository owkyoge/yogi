package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.Wallet;
import com.example.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	WalletService walService;

	@PostMapping("/wallsave")
	public void save(@RequestBody Wallet wall) {
		walService.save(wall);
	}

	@GetMapping("/walfind")
	public List<Wallet> find() {
		return walService.find();
	}

	@PostMapping("/wallupdate")
	public void update(@RequestBody Wallet wall) {
		walService.update(wall);
	}

	@DeleteMapping("/walldelete")
	public void delete(@RequestBody Wallet wall) {
		walService.delete(wall);
	}
}
