package com.mertnamsal;

import java.io.Serializable;

public class Motor implements Serializable {
	
	int motorNo;
	
	
	public Motor(int motorNo) {
		super();
		this.motorNo = motorNo;
	}

	public int getMotorNo() {
		return motorNo;
	}

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}
	
	
}
