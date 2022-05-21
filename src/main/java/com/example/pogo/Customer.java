package com.example.pogo;

import java.math.BigDecimal;

public class Customer {

	private int id;
	private String name;
	private BigDecimal salary;
	private Long phNo;

	public Customer(int id, String name, BigDecimal salary, Long phNo) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phNo = phNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

}
