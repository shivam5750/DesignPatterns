package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class Queen extends Piece {

    public Queen(Color color, int row, int col) {
        super(color, row, col);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        // Queen can mive in any direction apart the moves of knight
        int rowDiff = Math.abs(destRow - row);
        int colDiff = Math.abs(destCol - col);
        return (rowDiff == colDiff) || (row == destRow || col == destCol);
    }
    
}
