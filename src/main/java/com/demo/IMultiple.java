/**
 * 
 */
package com.demo;

import org.springframework.stereotype.Component;

/**
 * @author gmihindou
 *
 */
public interface IMultiple {

	/**
	 * Verifie si un nombre est multiple de 3
	 * @param number
	 * @return
	 */
	boolean isMultiple3(int number);

	/**
	 * Verifie si un nombre est multiple de 5
	 * @param number
	 * @return
	 */
	boolean isMultiple5(int number);
}
