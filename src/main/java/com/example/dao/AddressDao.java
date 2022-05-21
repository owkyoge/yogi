package com.example.dao;

import java.util.List;

import com.example.pogo.Address;

public interface AddressDao {

	void save(Address add);

	List<Address> find();

	void update(Address add);

	void delete(Address add);

}
