package com.model;
public class Cell {
	//attributes
	private MarkType marktype;

	//constructor
	public Cell() {
		this.marktype = MarkType.E;
	}
	

	// getters and setters
	public MarkType getMark()
	{
		return marktype;
	}
	
	@Override
	public String toString() {
		return "Cell [marktype=" + marktype + "]";
	}


	public void setMark(MarkType markType) throws CellAlreadyMarkedException
	{
		if(this.marktype != MarkType.E)
		{
			throw new CellAlreadyMarkedException("Cell is already marked.");
		}
		this.marktype = markType;
	}

	public boolean isEmpty()
	{
		return marktype == MarkType.E;
	}
	
}