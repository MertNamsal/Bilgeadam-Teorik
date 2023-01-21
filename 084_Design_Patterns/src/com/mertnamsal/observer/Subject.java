package com.mertnamsal.observer;

//Observable veya Topic
public interface Subject {
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);
}
