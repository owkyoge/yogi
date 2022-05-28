package com.example.neww;

import org.springframework.stereotype.Component;

@Component("child")
public class ChildCartServiceImpl implements CartService {

	@Override
	public String addCart() {
		return "Added Child Cart";
	}

}
