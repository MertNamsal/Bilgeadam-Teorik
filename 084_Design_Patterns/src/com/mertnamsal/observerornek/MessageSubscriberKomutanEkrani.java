package com.mertnamsal.observerornek;

public class MessageSubscriberKomutanEkrani implements Observer,ObserverNBC {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscribeOne: "+ m.getMessageContent());
		System.out.println("Komutan ekranında alarm çal");
		
	}

	@Override
	public void update(MessageNBC m) {
		System.out.println("Message Subscriber One (komutan ekranı) : "+ m.getMessageContent());
		
	}

}
