package com.creational.factory.model;

public class ShapeFactory {
	public static IShape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		
		switch(shapeType.toLowerCase())
		{
		case"Circle":
			return new Circle();
			
		case"Rectangle":
			return new Rectangle();
			
		case"Square":
			return new Square();
			
		}
		Default: 
			throw new IllegalArgumentException("invalid shape type");
		
	}
}

