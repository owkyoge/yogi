package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.SenderReciver;
import com.example.service.FundService;

@RestController
public class FundController {

	@Autowired
	FundService fundService;

	@GetMapping("/fundfind")
	public void find(@RequestBody SenderReciver sr) {
		fundService.find(sr);

	}
}
