package com.mertnamsal.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	
	//getShape method returns object of input type shape
	
	@Override
	public IShape getShape(String shape) {
		if(shape == null || shape.isEmpty()) {
			return null;
		}
		if(shape.equalsIgnoreCase(IShape.CIRCLE)) {
			
			return new Circle();
		}else if(shape.equalsIgnoreCase(IShape.RECTANGLE)) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
