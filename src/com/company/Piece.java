package com.company;

import java.util.ArrayList;

public abstract class Piece {
    public String color;
    Tile[] openTiles;
    public boolean inPlay;
    public String pieceType;
    public static ArrayList<Piece> pieces = new ArrayList<Piece>();

    public void move(){
        switch (pieceType){
            case "pawn":
                break;
            case "rook":
                break;
            case "king":
                break;
            case "queen":
                break;
            case "bishop":
                break;
            case "knight":
                break;
        }
    }

    void Piece(){

    }
    public void kill(){
        pieces.remove(this);
    }

}
