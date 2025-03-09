package com.facade;

import com.model.*;

import java.util.Scanner;

public class TicTacToeFacade {
    private Board board;
    private ResultAnalyzer analyzer;
    private MarkType currentPlayer;
    private Scanner scanner;

    public TicTacToeFacade() {
        board = new Board();
        analyzer = new ResultAnalyzer(board);
        currentPlayer = MarkType.X;
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("Welcome to Tic-Tac-Toe!");
        displayBoard();

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (0-8): ");
            int move = scanner.nextInt();

            if (!makeMove(move)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            displayBoard();
            ResultType result = analyzer.analyzeResult();

            if (result == ResultType.WIN) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (result == ResultType.DRAW) {
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }

        scanner.close();
    }

    private boolean makeMove(int move) {
        try {
            board.setCellMark(move, currentPlayer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == MarkType.X) ? MarkType.O : MarkType.X;
    }

    private void displayBoard() {
        for (int i = 0; i < 9; i++) {
            System.out.print(board.getCellMark(i) + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}
