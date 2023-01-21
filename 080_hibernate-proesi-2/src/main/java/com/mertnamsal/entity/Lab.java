package com.mertnamsal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "labaratuvar")
public class Lab {
	
	@Id
	private int labId;
	private String lokasyon;
	
	public Lab() {
		super();
	}
	
	
	public Lab(int labId, String lokasyon) {
		super();
		this.labId = labId;
		this.lokasyon = lokasyon;
	}


	public int getLabId() {
		return labId;
	}


	public void setLabId(int labId) {
		this.labId = labId;
	}


	public String getLokasyon() {
		return lokasyon;
	}


	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}


	@Override
	public String toString() {
		return "Lab [labId=" + labId + ", lokasyon=" + lokasyon + "]";
	}
	
	
	
	

}
