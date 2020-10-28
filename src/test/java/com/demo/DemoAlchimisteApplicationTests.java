package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAlchimisteApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private IPrintBuilder ip;
	@Autowired
	private IMultiple m;
	
	@Autowired
	private IContain c;
	
	    @Test
	    void testMultiple() {
	     
	        assertEquals(m.isMultiple3(9), true);
	        assertEquals(m.isMultiple5(25), true);
	        
	        assertEquals(m.isMultiple3(8), false);
	        assertEquals(m.isMultiple5(27), false);
	        
	    }
	    
	     
	    @Test
	    void testContain() {
	        assertEquals(c.contain5(45), true);
	        assertEquals(c.contain3(34), true);
	        
	        assertEquals(c.contain5(47), false);
	        assertEquals(c.contain3(44), false);
	    }
	    
	    
	    
	    @Test
	    void testPrint() {
	        assertEquals(ip.printBuzz(65), "...Buzz...");
	        assertEquals(ip.printBuzz(541), "...Buzz...");
	        assertEquals(ip.printBuzz(41), null);
	        
	        assertEquals(ip.printFizz(30), "...Fizz...");
	        assertEquals(ip.printFizz(43), "...Fizz...");
	        assertEquals(ip.printFizz(44), null);
	    }

}
