package com.example.dao;

import com.example.pogo.Customer;

public interface CustomerDao {

	void saveCus(Customer c);

	void find();

	void update(Customer c);

	void delete(Customer c);

}
