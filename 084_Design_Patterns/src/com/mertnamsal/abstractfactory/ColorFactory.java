package com.mertnamsal.abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	IColor getColor(String color) {
		if(color == null || color.isEmpty()) {
			return null;
		}
		if(color.equalsIgnoreCase(IColor.BLUE)) {
			return new Blue();
		}else if(color.equalsIgnoreCase(IColor.GREEN)) {
			return new Green();
		}
		return null;
	}

	@Override
	IShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
