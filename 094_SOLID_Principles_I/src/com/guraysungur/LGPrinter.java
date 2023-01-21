package com.guraysungur;

public class LGPrinter implements IMultiPurposePrinter {

	@Override
	public void print() {
		System.out.println("B/W printing..");
		
	}

	@Override
	public void colorPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fax() {
		System.out.println("Faxing...");
		
	}

	@Override
	public void scan() {
		System.out.println("scanning documents...");
		
	}

}
