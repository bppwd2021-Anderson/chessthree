package com.company;

public abstract class Piece {
    public String color;
    Tile[] openTiles;
    boolean inPlay;

    public abstract void move();

    void Piece(){

    }

}
