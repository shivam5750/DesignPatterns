package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class Rook extends Piece{

    public Rook(Color color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        // Since rook move either horizontally or vertically
        return (row == destRow || col == destCol);
    }
    
}
