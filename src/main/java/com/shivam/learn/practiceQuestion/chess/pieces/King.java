package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class King extends Piece{

    public King(Color color, int row, int col) {
        super(color, row, col);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        // Since King can move only 1 step in any direction
        int rowDiff = Math.abs(destRow-row);
        int colDiff = Math.abs(destCol-col);
        return rowDiff<=1 && colDiff<=1;
    }
    
}
