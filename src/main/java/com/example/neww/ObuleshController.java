package com.example.neww;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObuleshController {

	@Qualifier("vasantha")
	@Autowired
	ObuleshService vasanthaService;
	
	@Qualifier("nani")
	@Autowired
	ObuleshService nalliniService;
	
	@GetMapping("daughter1")
	public String getName() {
		String resp = vasanthaService.getName();
		return resp;
	}
	
	@GetMapping("daughter2")
	public String gettName() {
		String resp = nalliniService.getName();
		return resp;
	}
}
