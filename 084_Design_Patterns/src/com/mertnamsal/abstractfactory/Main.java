package com.mertnamsal.abstractfactory;


public class Main {

	//Abstract Factory design pattern'da nesnelerin oluşturmaktan sorumlu fabrikları oluşturan bir süper fabrika oluşturur.
	
	//Factory vs. Abstract Factory
	
	// Factory Design Pattern'da birbiri ile benzer nitelikteki nesneleri üreten bir fabrika sınıfı oluşturulur.
	//Abstract Factory Design Pattern'da ise benzer nitelikteki nesneleri üretebilmek için her nesne grubu içi ayrı bir fabrika sınıfı oluşturulmalıdır.
	public static void main(String[] args) {
		
		//Önce FactoryGenerator ı kullanıp istediğimiz tipte bir factory üretiriz
		
		AbstractFactory shapeFactory = FactoryGenerator.getFactory(AbstractFactory.SHAPE);
		
		//Daha sonra ürettiğimiz bu fabrikayı kullanarak nesne üretebiliriz.
		IShape shape1 = shapeFactory.getShape(IShape.CIRCLE);
		shape1.drawShape();
		
		shapeFactory.getShape(IShape.RECTANGLE).drawShape();
		
		AbstractFactory colorFactory = FactoryGenerator.getFactory(AbstractFactory.COLOR);
		IColor yesil = colorFactory.getColor(IColor.GREEN);
		yesil.fillColor();
		IColor mavi = colorFactory.getColor(IColor.BLUE);
		mavi.fillColor();
		
	}
}
