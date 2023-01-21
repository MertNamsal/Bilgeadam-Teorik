package com.mertnamsal.dip;

public class Email implements IMessage{

	@Override
	public void sendMessage() {
		sendEmail();
		
	}

	private void sendEmail() {
		System.out.println("Sending Email..");
		
	}

}
