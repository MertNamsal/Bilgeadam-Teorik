package com.mertnamsal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToplamaTest {

	Toplama toplama = new Toplama();
	
	@Test
	void toplamaYapTest1() {
		assertEquals(4, toplama.toplamaYap(1,3));
	}
	
	@Test
	void toplamaYapTest2() {
		assertEquals(10, toplama.toplamaYap(2,8));
	}
	
	@Test
	void toplamaYapTest3() {
		assertEquals(0, toplama.toplamaYap(1,-1));
	}
	
	

}
