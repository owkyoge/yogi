package com.example.neww;

import org.springframework.stereotype.Component;

@Component("nani")
public class NalliniServiceImpl implements ObuleshService {

	@Override
	public String getName() {
		return "My Second Daughter name is Nallini";
	}

}

