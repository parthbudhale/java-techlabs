package com.test;

import java.util.Scanner;

import com.model.Board;
import com.model.CellAlreadyMarkedException;
import com.model.MarkType;
import com.model.ResultAnalyzer;
import com.model.ResultType;

public class Game {

	public static void main(String[] args) throws CellAlreadyMarkedException {
		
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		for(int i = 0; i < 9; i++)
		{
			
			System.out.println("Enter X or O ");
			char ch = scanner.next().charAt(0);
			scanner.nextLine();
			System.out.println("Enter the location ");
			int loc = scanner.nextInt();
			scanner.nextLine();
			if(ch=='X')
			{
				board.setCellMark(loc, MarkType.X);
				for(int j = 0; j < 9; j++)
				{	
					
					System.out.print(board.getCells()[j].getMark()+" ");
					count++;
					if(count == 3)
					{
						System.out.println();
						count = 0;
					}
				}
			}
			else if(ch=='O')
			{
				board.setCellMark(loc, MarkType.O);
				for(int j = 0; j < 9; j++)
				{	
					
					System.out.print(board.getCells()[j].getMark()+" ");
					count++;
					if(count == 3)
					{
						System.out.println();
						count = 0;
					}
				}
			}
			
			//2 player needed for x and o
			//player 1 = x and player 2 = o
			//only location will be asked
			
			if(i==2 || i==3||i==4||i==5||i==6||i==7|| i==8)
			{
				if(result.analyzeResult().equals(ResultType.WIN))
				{
					System.out.println("Win");
					return;
				}
			}
			
		}
	}

}