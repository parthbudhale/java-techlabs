package LSP.correction.model;

public class Circle implements IShape {
	public double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double CalculateArea() {
		
		return  3.14*(radius*radius);
	}

}
