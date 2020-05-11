/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author Enzo
 */
public class Rook extends ChessPiece{

    public Rook(Color color, Board board) {
        //INFORMANDO OS DADOS E REPASSANDO PARA O CONSTRUTOR DA SUPER CLASSE
        super(color, board);
    }

    

    @Override
    public String toString() {
        return "R";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        //ABOVE
        p.setValues(position.getRow() - 1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
           p.setRow(p.getRow() - 1);
           
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
        }
        
        //BELOW
        p.setValues(position.getRow() + 1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
           p.setRow(p.getRow() + 1);
           
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
        }
        
        //LEFT
        p.setValues(position.getRow(), position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
           p.setColumn(p.getColumn() - 1);
           
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
        }
        
        //RIGHT
        p.setValues(position.getRow(), position.getColumn() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
           p.setColumn(p.getColumn() + 1);
           
        }
        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            mat [p.getRow()][p.getColumn()] = true;
        }
        
        return mat;
    }
    
    
}
