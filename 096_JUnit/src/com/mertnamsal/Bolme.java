package com.mertnamsal;

public class Bolme {

	public Integer bolmeYap(int i, int j) {
		
		if(i == 0) {
			throw new ArithmeticException("Division by zero is not supported");
		}
		
		return i/j;
	}

}
