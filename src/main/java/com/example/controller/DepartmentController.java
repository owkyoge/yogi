package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pogo.Department;
import com.example.pogo.Employee;
import com.example.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService deptService;

	@PostMapping("/saver")
	public void saveDeptt(@RequestBody Department dept) {
		deptService.saveDeptt(dept);
	}

	@GetMapping("/finder")
	public List<Department> findAll() {
		return deptService.findAlll();
	}

	@PutMapping("/updater")
	public void updateDeppt(@RequestBody Department dept) {
		deptService.update(dept);
	}
	
	@DeleteMapping("/deleter")
	public void deletedept(@RequestBody Department dept) {
		deptService.delete(dept);
	}

}
