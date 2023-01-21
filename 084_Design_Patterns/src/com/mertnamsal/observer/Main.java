package com.mertnamsal.observer;

public class Main {
	//Observer pattern nesneler arasında otomatik mesaj paylaşımı yapmamıza yardımcı olur
	public static void main(String[] args) {
		
		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		
		
		MessagePublisher p = new MessagePublisher();
		p.attach(s1);
		p.attach(s2);
	
		
		p.notifyUpdate(new Message("Sıcaklık 40 C derece")); //s1 ve s2 nin bu update i alması gerekiyor
		
		p.detach(s2);
		p.notifyUpdate(new Message("Sıcaklık 35 C derece"));
		
		System.out.println("*******************");
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		p.attach(s3);
		p.notifyUpdate(new Message("Sıcaklık 25 C derece"));
		
		p.notifyUpdate(new Message("Sıcaklık 10 C derece"));
		
		
		
		
	}
}
