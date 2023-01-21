package com.mertnamsal.observerornek;

import java.util.ArrayList;
import java.util.List;

	public class MessagePublisherNBCDetector implements SubjectNBC {

	
		
		private List<ObserverNBC> observers = new ArrayList<>();
		
		@Override
		public void attach(ObserverNBC o) {
			if(!observers.contains(o)) {
				observers.add(o);
			}
			
		}
	
		@Override
		public void detach(ObserverNBC o) {
			if(observers.contains(o)) {
				observers.remove(o);
			}
			
		}
	
		@Override
		public void notifyUpdate(MessageNBC m) {
			for(ObserverNBC o: observers) {
				o.update(m);
			}
			
	}

}
