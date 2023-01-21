package com.guraysungur.isp;

public class LGPrinter implements IPrintBW, IScan, IFax {

	@Override
	public void fax() {
		System.out.println("faxing...");
		
	}

	@Override
	public void scan() {
		System.out.println("scanning...");
		
	}

	@Override
	public void print() {
		System.out.println("B/W printing...");
		
	}

}
