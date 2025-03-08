package com.creational.factory.test;

import com.creational.factory.model.IShape;
import com.creational.factory.model.ShapeFactory;

public class factortTest {
	public static void main(String[] args) {
		IShape shape1 = ShapeFactory.getShape("Circle");
		IShape shape2 = ShapeFactory.getShape("Rectangle");
	//	IShape shape3 = ShapeFactory.getShape("Rhombus");
		
		
		
		shape1.draw();
		shape2.draw();
	//	shape3.draw();
		
		
	}

}
