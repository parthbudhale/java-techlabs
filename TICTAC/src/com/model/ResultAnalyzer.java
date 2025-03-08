package com.model;

public class ResultAnalyzer {
	  private Board board;

	    public ResultAnalyzer(Board board) {
	        this.board = board;
	    }

	    private boolean horizontalWinCheck() {   //Loops through row indices (0, 3, 6) to check horizontal lines.
	        for (int i = 0; i < 9; i += 3) {
	            if (board.getCellMark(i) != MarkType.EMPTY &&
	                board.getCellMark(i) == board.getCellMark(i + 1) &&
	                board.getCellMark(i) == board.getCellMark(i + 2)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private boolean verticalWinCheck() {    //Loops through row indices (0, 1, 2) to check horizontal lines.
	        for (int i = 0; i < 3; i++) {
	            if (board.getCellMark(i) != MarkType.EMPTY &&
	                board.getCellMark(i) == board.getCellMark(i + 3) &&
	                board.getCellMark(i) == board.getCellMark(i + 6)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private boolean diagonalWinCheck() {
	        return (board.getCellMark(0) != MarkType.EMPTY &&
	                board.getCellMark(0) == board.getCellMark(4) &&
	                board.getCellMark(0) == board.getCellMark(8)) ||
	               (board.getCellMark(2) != MarkType.EMPTY &&
	                board.getCellMark(2) == board.getCellMark(4) &&
	                board.getCellMark(2) == board.getCellMark(6));
	    }

	    public ResultType analyzeResult() {
	        if (horizontalWinCheck() || verticalWinCheck() || diagonalWinCheck()) {
	            return ResultType.WIN;
	        }
	        if (board.isBoardFull()) {
	            return ResultType.DRAW;
	        }
	        return ResultType.PROGRESS;
	    }
	}


