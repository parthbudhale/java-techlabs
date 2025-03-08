package LSP.violation.model;

public class Rectangle {
	public double length,height;

	public void setLength(double length) {
		this.length = length;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea()
	{
		return length*height;
	}


}
