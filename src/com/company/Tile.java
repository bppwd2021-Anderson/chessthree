package com.company;

import java.util.ArrayList;

public class Tile {
    public Piece pieceHeld;
    public ArrayList<Piece> threatenedBy = new ArrayList<>();
    public int[] location;
    public int value;

    public Tile(int x, int y){
        this.location = new int[]{x,y};
    }
    public void updateThreaten(Piece threat, boolean newThreat){
        if(newThreat) {
            threatenedBy.add(threat);
        }
        else{
            threatenedBy.remove(threat);
        }

    }

    public boolean addToHeld(Piece newPiece){
        if(pieceHeld == null) {
            pieceHeld = newPiece;
            value += newPiece.value;
            return true;
        }
        else if(!pieceHeld.color.equals(newPiece.color)){
            value -= pieceHeld.value;
            pieceHeld.kill();
            pieceHeld = newPiece;
            value += newPiece.value;
            return true;
        }
        return false;// Only if there is a same colored piece in the way
    }
    public Piece moveHeld(){
        Piece tempPiece = pieceHeld;
        pieceHeld = null;
        return tempPiece;
    }
    public void update() {
        if (pieceHeld != null){
            value = pieceHeld.value;
        }
        for(Piece piece : threatenedBy) {


        }
    }

    @Override
    public String toString() {
        return "Tile{" +
                "pieceHeld=" + pieceHeld +
                '}';
    }
}
