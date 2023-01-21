package com.mertnamsal.observer;

public class MessageSubscriberOne implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscribeOne: "+ m.getMessageContent());
		
	}

}
