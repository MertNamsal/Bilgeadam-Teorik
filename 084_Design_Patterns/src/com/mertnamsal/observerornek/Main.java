package com.mertnamsal.observerornek;

public class Main {
	//Observer pattern nesneler arasında otomatik mesaj paylaşımı yapmamıza yardımcı olur
	public static void main(String[] args) {
		
		MessageSubscriberKomutanEkrani s1 = new MessageSubscriberKomutanEkrani();
		MessageSubscriberHaberlesmeSaglayici s2 = new MessageSubscriberHaberlesmeSaglayici();
		MessageSubscriberStingerBataryasi s3 = new MessageSubscriberStingerBataryasi();
		
		MessagePublisherRadar p = new MessagePublisherRadar();
		p.attach(s1);
		p.attach(s2);
		p.attach(s3);
		
		p.notifyUpdate(new Message("Düşman kamuflajına sahip hava aracı","Düşman Mi-24 Saldırı Helikopteri",240,45,1)); //s1 ve s2 nin bu update i alması gerekiyor
		
		System.out.println("\n ********* \n");
		
		MessagePublisherNBCDetector p2 = new MessagePublisherNBCDetector();
		p2.attach(s1);
		p2.notifyUpdate(new MessageNBC("Güney yönünden kimyasal gaz uyarısı"));
		
		System.out.println("\n ********* \n");
		p2.detach(s1);
		p2.attach(s2);
		p2.notifyUpdate(new MessageNBC("Biyolojik saldırı ihtimali yüksek!"));
		
		
	}
}
