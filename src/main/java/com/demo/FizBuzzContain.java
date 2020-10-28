/**
 * 
 */
package com.demo;

import org.springframework.stereotype.Component;

/**
 * @author gmihindou
 *
 */
@Component
public class FizBuzzContain implements IContain {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.IContain#contain5(int)
	 */
	@Override
	public boolean contain5(int number) {
		String numberString = Integer.toString(number);
		return numberString.indexOf("5") >= 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.demo.IContain#contain3(int)
	 */
	@Override
	public boolean contain3(int number) {
		String numberString = Integer.toString(number);
		return numberString.indexOf("3") >= 0;
	}

}
