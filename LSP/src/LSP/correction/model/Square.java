package LSP.correction.model;

public class Square  implements IShape{
	public double side;
	
	public Square(double side) {
		this.side=side;
	}

	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
