package com.example.service;

import java.util.List;

import com.example.pogo.Address;

public interface AddressService {

	List<Address> findd();

	void save(Address add);

	void updatee(Address add);

	void delete(Address add);

}
