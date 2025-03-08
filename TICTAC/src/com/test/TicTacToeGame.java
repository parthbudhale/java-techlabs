package com.test;

import java.util.Scanner;

import com.model.Board;
import com.model.MarkType;
import com.model.ResultAnalyzer;
import com.model.ResultType;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        ResultAnalyzer analyzer = new ResultAnalyzer(board);
        MarkType currentPlayer = MarkType.X;

        System.out.println("Welcome to Tic-Tac-Toe!");
        board.displayBoard();

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (0-8): ");
            int move = scanner.nextInt();

            try {
                board.setCellMark(move, currentPlayer);
            } catch (Exception e) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board.displayBoard();
            ResultType result = analyzer.analyzeResult();

            if (result == ResultType.WIN) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (result == ResultType.DRAW) {
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == MarkType.X) ? MarkType.O : MarkType.X;
        }

        scanner.close();
    }
}