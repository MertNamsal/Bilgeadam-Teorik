package com.mertnamsal.observerornek;

public class MessageSubscriberHaberlesmeSaglayici implements Observer,ObserverNBC {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo : "+m.getMessageContent());
		
		if(m.getAciliyet()==1) {
			System.out.println("Genel karargaha alarm mesajı gönder!");
		}
		
	}

	@Override
	public void update(MessageNBC m) {
		System.out.println("Haberleşme birimi gelen mesajı karargaha gönderdi : "+m.getMessageContent());
		
	}

}
