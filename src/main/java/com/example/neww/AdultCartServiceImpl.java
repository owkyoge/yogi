package com.example.neww;

import org.springframework.stereotype.Component;

@Component("adult")
public class AdultCartServiceImpl implements CartService {

	@Override
	public String addCart() {
		return "Added Adult Cart";
	}

}
