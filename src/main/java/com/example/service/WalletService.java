package com.example.service;

import java.util.List;

import com.example.pogo.Wallet;

public interface WalletService {

	void save(Wallet wall);

	List<Wallet> find();

	void update(Wallet wall);

	void delete(Wallet wall);

}
