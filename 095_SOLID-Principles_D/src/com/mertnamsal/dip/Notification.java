package com.mertnamsal.dip;

import java.util.List;

public class Notification {

	private List<IMessage> messages;
	
	public Notification(List<IMessage> messages) {
		this.messages=messages;
	}
	
	public void send() {
		for(IMessage message: messages) {
			message.sendMessage();
		}
	}
}
