package com.demo;

import org.springframework.stereotype.Component;

@Component
public class FizBuzzMultiple implements IMultiple {

	@Override
	public boolean isMultiple3(int number) {
		 return number % 3 == 0;
	}

	@Override
	public boolean isMultiple5(int number) {
		 return number % 5 == 0;
	}

}
