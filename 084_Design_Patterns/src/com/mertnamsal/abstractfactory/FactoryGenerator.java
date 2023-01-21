package com.mertnamsal.abstractfactory;

public class FactoryGenerator {

	private static ShapeFactory shapeFactory;
	private static ColorFactory colorFactory;
	
	public static AbstractFactory getFactory(String factoryType) {
		
		if(factoryType == null || factoryType.isEmpty()) {
			return null;
		}
		if(factoryType.equalsIgnoreCase(AbstractFactory.SHAPE)) {
			if(shapeFactory== null ){
				shapeFactory = new ShapeFactory();
			}
			return shapeFactory;
		}else if(factoryType.equalsIgnoreCase(AbstractFactory.COLOR)) {
			if(colorFactory== null) {
				colorFactory = new ColorFactory();
			}
			return colorFactory;
		}
		return null;
	}
}
