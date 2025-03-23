package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class Bishop extends Piece{

    public Bishop(Color color, int row, int col) {
        super(color, row, col);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        // Since bishop can move only diagonally 
        // Therefore row and col will be always equal
        int rowDiff = Math.abs(destRow-row);
        int colDiff = Math.abs(destCol-col);
        return rowDiff == colDiff;
    }
    
}
