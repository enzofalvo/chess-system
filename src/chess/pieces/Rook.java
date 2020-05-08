/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
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
    
    
}
