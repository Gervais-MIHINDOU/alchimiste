/**
 * 
 */
package com.demo;

/**
 * @author gmihindou
 *
 */
public interface IPrintBuilder {

	
	/**
	 * Affiche Buzz si le nombre est multiple de 3 ou contient 3
	 * @param number
	 * @return
	 */
	String printFizz(int number);
	
	/**
	 * Affiche Buzz si le nombre est multiple de 5 ou contient 5
	 * @param number
	 * @return
	 */
	String printBuzz(int number);
}
