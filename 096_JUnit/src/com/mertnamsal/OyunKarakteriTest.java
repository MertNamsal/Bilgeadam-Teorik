package com.mertnamsal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OyunKarakteriTest {
	
	OyunKarakteri oyunKarakteri = new OyunKarakteri();

	@Test
	void test1() {
		assertEquals("Selam", oyunKarakteri.cevapla("merhaba"));
	}
	
	//yukardaki ifade aşağıdaki gibide kodlanabilir.
	@Test
	void test2() {
		String cevap = oyunKarakteri.cevapla("merhaba");
		if(!cevap.equalsIgnoreCase("selam")) {
			fail("Yanlış cevap");
		}
	}
	
	@Test
	void test3() {
		assertEquals("hey", oyunKarakteri.cevapla("hi"));
	}
	
	@Test
	void tepkiVerTest() {
		assertEquals("Sinirlen", oyunKarakteri.tepkiVer("kızmak"));
	}
	
	@Test
	void tepkiVerTest2() {
		assertEquals("nötr", oyunKarakteri.tepkiVer("el kaldırmak"));
	}
	
	

}
