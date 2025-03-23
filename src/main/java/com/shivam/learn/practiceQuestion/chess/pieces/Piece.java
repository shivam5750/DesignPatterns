package com.shivam.learn.practiceQuestion.chess.pieces;

import com.shivam.learn.practiceQuestion.chess.Board;
import com.shivam.learn.practiceQuestion.chess.Color;

public abstract class Piece {
    
    protected Color color;
    protected int row;
    protected int col;

    public Piece(Color color, int row, int col){
        this.color = color;
        this.row = row;
        this.col = col;
    }

    public abstract  boolean canMove(Board board, int destRow, int destCol);

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Color getColor() {
        return this.color;
    }



   

}
