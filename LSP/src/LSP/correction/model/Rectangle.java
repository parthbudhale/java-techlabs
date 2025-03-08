package LSP.correction.model;

public class Rectangle implements IShape {
	public double length,height;
	
	

	public Rectangle(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}



	@Override
	public double CalculateArea() {
		return length*height;
	}
	

}
