package com.mertnamsal.observer;

public class Message {

	final String messageContent; // Diğer sınıflar mesaj içeriğini değiştiremesin diye böyle yapıldı
	
	public Message(String m) {
		this.messageContent = m;
	}
	public String getMessageContent() {
		return messageContent;
	}
}
