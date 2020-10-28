package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintBuilderImpl implements IPrintBuilder {

	@Autowired
	private IMultiple m;
	
	@Autowired
	private IContain c;
	
	@Override
	public String printFizz(int number) {
		
		if(m.isMultiple3(number) || c.contain3(number)) {
			return "...Fizz...";
		}
		return null;
	}

	@Override
	public String printBuzz(int number) {
		if(m.isMultiple5(number) || c.contain5(number)) {
			return "...Buzz...";
		}
		return null;
	}

}
