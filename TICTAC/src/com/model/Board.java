package com.model;

public class Board {
	 private Cell[] cells = new Cell[9];

	    public Board() {
	        for (int i = 0; i < 9; i++) {
	            cells[i] = new Cell();
	        }
	    }

	    public boolean isBoardFull() {   // to check if any cell is still empty.
	        for (Cell cell : cells) {
	            if (cell.isEmpty()) 
	            return false;
	        }
	        return true;
	    }

	    public void setCellMark(int loc, MarkType mark) throws Exception {   // check loc is within the valid range (0 to 8).
	        if (loc < 0 || loc >= 9) {
	            throw new IllegalArgumentException("Invalid board position");   
	        }
	        cells[loc].setMark(mark);
	    }

	    public MarkType getCellMark(int loc) {
	        return cells[loc].getMark();
	    }

		public void displayBoard() {
			// TODO Auto-generated method stub
			
		}

	
	}


