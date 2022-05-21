package com.example.service;

import java.util.List;

import com.example.pogo.Department;

public interface DepartmentService {

	void saveDeptt(Department dept);

	List<Department> findAlll();

	void update(Department dept);

	void delete(Department dept);

}
