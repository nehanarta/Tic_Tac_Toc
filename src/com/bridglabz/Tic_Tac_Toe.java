package com.bridglabz;
import java.util.*;

public class Tic_Tac_Toe {
    static char[][] board = new char[10][10];

    static char currentplayer;

    void player() {
        for (int a = 0; a < board.length; a++) {
            currentplayer = 'x';
            initalBoard();
            System.out.println(board[a]);

        }
    }

    void initalBoard() {
        for (int r = 1; r < 10; r++) {
            for (int c = 1; c < 10; c++) {
                board[r][c] = '-';
            }
        }
    }

    public void chooseLatter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("player 1: x");
        int player1 = sc.nextInt();
        System.out.println(player1);
        System.out.println("player 2 :o");
        int player2 = sc.nextInt();
        System.out.println(player2);

    }

public void showBoard(){
        for(int r=0;r< board.length;r++){
         //   for (int c=)
        }
}

}

