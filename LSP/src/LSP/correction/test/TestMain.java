package LSP.correction.test;

import LSP.correction.model.Rectangle;
import LSP.correction.model.Square;

public class TestMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4,3);
		System.out.println(rectangle.CalculateArea());
		
		Square sq = new Square(6);
		System.out.println(sq.CalculateArea());
}

}


