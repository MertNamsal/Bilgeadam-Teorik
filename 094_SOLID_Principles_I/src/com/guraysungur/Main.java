package com.guraysungur;

public class Main {

	public static void main(String[] args) {
		CanonPrinter printer = new CanonPrinter();
		printer.print();  // Ok.
		printer.fax(); // nothing happens! Ancak bu sınıfın interface'i bize derki bu sınıf fax çekebilir!!! Ama gerçekte fax çekemez. 
					   // Bu tasarım ISP'ye aykırıdır. 
					   // Nasıl düzelteceğiz?
					   // Interface'leri ayırmamız gerekecek.
		
	}

}
