package com.example.dao;

import java.util.List;

import com.example.pogo.Department;

public interface DepartmentDao {

	void saveDept(Department dept);

	List<Department> findAll();

	void update(Department dept);

	void delete(Department dept);

}
