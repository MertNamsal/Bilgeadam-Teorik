package com.guraysungur;

// CanonPrinter'ım sadece siyah beyaz baskı yapıyor ancak IMultiPurposePrinter interface'ini implement 
// ettiği için diğer metodlaır da içinde baırndırmak zorunda
public class CanonPrinter implements IMultiPurposePrinter {

	@Override
	public void print() {
		System.out.println("B/W printing...");
		
	}

	@Override
	public void colorPrint() { 
		// nothing here
	}

	@Override
	public void fax() {
		// nothing here		
	}

	@Override
	public void scan() {
		// nothing here
	}

}
