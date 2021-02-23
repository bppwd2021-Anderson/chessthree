package com.company;

import java.util.ArrayList;

public abstract class Piece {
    public String color;
    ArrayList<Tile> movementOptions = new ArrayList<>();
    public boolean inPlay;
    public String pieceType;
    public static ArrayList<Piece> pieces = new ArrayList<Piece>();
    public int value;
    public Tile currentTile;

    public void move(){
        switch (pieceType){
            case "pawn":
//                currentTile
//                movementOptions.add();
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
//
