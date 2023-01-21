package com.mertnamsal;

public class Notification {

	private Email email = new Email();
	private SMS sms = new SMS();
	
	public void sender() {
		email.sendEmail();
		sms.sendSMS();
	}
	//Burada OOP açısından herhangi bir hata yok ancak SOLID açısından bu tasarım hatalı!
	//Buradaki problem üst seviye bir sınıfın (Notification) alt seviye sınıflara (Email ve SMS)
	//direk bağlı olmasıdır. Bu tasarımın DIP ' e uygun olması için Notification sınıfının SMS ve Email
	//sınıflarına olan direk bağımlılığını kaldırmamız gerekiyor.
	//Bunu yapmak için araya abstraction koymamız gerekiyor.
}
