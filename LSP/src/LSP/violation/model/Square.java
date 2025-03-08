package LSP.violation.model;

public class Square extends Rectangle {
	
	public void setHeight(double height)
	{
		this.height=height;
		this.length=height;
	}
	public void setLength(double length)
	{
		this.length=length;
		this.height=length;
	}
	    
}

