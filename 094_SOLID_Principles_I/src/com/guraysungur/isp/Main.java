package com.guraysungur.isp;



public class Main {

	public static void main(String[] args) {
		CanonPrinter printer = new CanonPrinter();
		printer.print();  // Ok.
//		printer.fax();    fax() metodu çağırılımıyor, doğrusu da bu! 
    					// Sadece gerçek anlamda içeriği kodla işlevsel dolu olan metodlar çağırılıyor..

		System.out.println("\n- - -\n");
		
		HPPrinter hpPrinter = new HPPrinter();
		hpPrinter.colorPrint();
		hpPrinter.print();
		
		
	}

}
