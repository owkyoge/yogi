package com.example.neww;

import org.springframework.stereotype.Component;

@Component("vasantha")
public class VasanthaServiceImpl implements ObuleshService{

	@Override
	public String getName() {
		return "My First Daughter name is Vasantha";
	}

}
