package com.mertnamsal;

public class GenericSinif <T> {
	
	public T obj;
	
	public GenericSinif(T object) {
		this.obj=object;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	
}
