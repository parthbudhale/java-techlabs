package com.model;

public class Cell {
	 private MarkType mark;

	    
	    public Cell() {      // Constructor initializes the cell as EMPTY
	        this.mark = MarkType.EMPTY;
	    }

	    public boolean isEmpty() {
	        return mark == MarkType.EMPTY;
	    }

	    public MarkType getMark() {
	        return mark;
	    }

	    public void setMark(MarkType mark) throws Exception {
	        if (!isEmpty()) {
	            throw new Exception("CellAlreadyMarkedException");
	        }
	        this.mark = mark;
	    }
	}


