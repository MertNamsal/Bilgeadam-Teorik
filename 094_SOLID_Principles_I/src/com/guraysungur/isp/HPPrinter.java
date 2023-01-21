package com.guraysungur.isp;

public class HPPrinter implements IPrintBW, IPrintColor {

	@Override
	public void colorPrint() {
		System.out.println("Color printing..");
		
	}

	@Override
	public void print() {
		System.out.println("B/W printing..");		
	}

}
