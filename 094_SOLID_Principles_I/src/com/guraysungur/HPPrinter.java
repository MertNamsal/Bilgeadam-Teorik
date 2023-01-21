package com.guraysungur;

// Bu da sadece S/B ve renkli print yapıyor fax ve scan özelliği yok..
public class HPPrinter implements IMultiPurposePrinter {

	@Override
	public void print() {
		System.out.println("B/W printing..");
		
	}

	@Override
	public void colorPrint() {
		System.out.println("Color printing..");
		
	}

	@Override
	public void fax() {
		// nothing here..
		
	}

	@Override
	public void scan() {
		// nothing here..		
	}

}
