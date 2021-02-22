package com.company;

public class Tile {
    public Piece pieceHeld;
    boolean threatened;
    int[] location;
    int value;

    public Tile(int x, int y){
        this.location = new int[]{x,y};
    }
    public void updateThreaten(boolean newCon){
        threatened = newCon;
    }
    public boolean addToHeld(Piece newPiece){
        if(pieceHeld == null) {
            pieceHeld = newPiece;
            return true;
        }
        else if(pieceHeld.color != newPiece.color){
            pieceHeld.kill();// not sure if I want to add in a kill here or if I just want to override with newPiece
            pieceHeld = newPiece;
            return true;
        }
        return false;// Only if there is a same colored piece in the way
    }
    public Piece moveHeld(){
        Piece tempPiece = pieceHeld;
        pieceHeld = null;
        return tempPiece;
    }
}
