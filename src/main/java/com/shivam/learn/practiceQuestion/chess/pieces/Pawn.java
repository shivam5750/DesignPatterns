package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public class Pawn extends Piece {

    public Pawn(Color color, int row, int col) {
        super(color, row, col);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean canMove(Board board, int destRow, int destCol) {
        int rowDiff = destRow - row;
        int colDiff = Math.abs(destCol - col);

        if(color == Color.WHITE){
            return (rowDiff==1 && colDiff==0)||
                   (row==1 && rowDiff ==2 && colDiff==0) ||
                   (rowDiff == colDiff && board.getPiece(destRow, destCol) != null);
        }else{
            return (rowDiff==-1 && colDiff==0)||
            (row==6 && rowDiff ==-2 && colDiff==0) ||
            (rowDiff == -1 && colDiff == 1 && board.getPiece(destRow, destCol) != null);
        }

    }
    
}
