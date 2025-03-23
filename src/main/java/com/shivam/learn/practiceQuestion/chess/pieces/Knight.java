package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class Knight extends Piece{

    public Knight(Color color, int row, int col) {
        super(color, row, col);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        // Since knight move either 2 row and 1 col or 2 col 1 row
        int rowDiff = Math.abs(destRow-row);
        int colDiff = Math.abs(destCol-col);
        return (rowDiff==2 && colDiff==1) || (colDiff ==2 && rowDiff==1);
    }
    
}
