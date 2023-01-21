package com.mertnamsal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BolmeTest {

	Bolme bolme = new Bolme();
	@Test
	void bolmeYapTest1() {
		assertEquals(5,bolme.bolmeYap(10,2));
	}
	
	@Test
	void bolmeYapTest2() {
		try {
			int x =bolme.bolmeYap(5, 0);
			fail("should throw an exception");
		} catch (ArithmeticException e) {
			assertEquals(true, e.getMessage().contains("by zero"));
		}
		
		
	}

}
