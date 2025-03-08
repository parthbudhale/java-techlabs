package LSP.violation.test;

import LSP.violation.model.Rectangle;
import LSP.violation.model.Square;

public class TestLSP {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(10);
		rectangle.setLength(5);
		
		System.out.println("area of rectangle is : "+rectangle.getArea());
		
		Square square = new Square();
		square.setHeight(10);
		System.out.println("the area of Square is : "+square.getArea());
		
		square.setLength(5);
	System.out.println("the area of square is : "+square.getArea());
	}

}
