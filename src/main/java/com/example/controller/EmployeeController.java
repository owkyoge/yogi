package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/find")
	public List<Employee> findAll(){
		return empService.findAlll();
	}
	
	@PostMapping("/save")
	public void saveEmpp(@RequestBody Employee e) {
		empService.saveEmpl(e);
	}
	
	@PutMapping("/update")
	public void updateEmp(@RequestBody Employee e) {
		empService.update(e);
	}
	

	@DeleteMapping("/delete")
	public void deleteEmp(@RequestBody Employee e) {
		empService.delete(e);
	}
	
	
	
}
