package com.mertnamsal.dip;

public class SMS implements IMessage {

	@Override
	public void sendMessage() {
		sendSMS();
		
	}

	private void sendSMS() {
		System.out.println("Sending SMS...");
		
	}

}
