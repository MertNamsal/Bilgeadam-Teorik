package com.mertnamsal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dolap {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String dolapno;

		
	public Dolap() {
		super();		
	}

		
	public Dolap(String dolapno) {
		super();
		this.dolapno = dolapno;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDolapno() {
		return dolapno;
	}

	public void setDolapno(String dolapno) {
		this.dolapno = dolapno;
	}
	
	
	
	
	

}
