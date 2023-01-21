package com.mertnamsal.abstractfactory;

public abstract class AbstractFactory {

	public static String SHAPE = "SHAPE";
	public static String COLOR = "COLOR";
	
	abstract IColor getColor(String color);
	
	abstract IShape getShape(String shape);
}
