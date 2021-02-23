package com.company;

import java.util.ArrayList;

public class Tile {
    public Piece pieceHeld;
    public ArrayList<Piece> threatenedBy = new ArrayList<>();
    public int[] location;
    public int bValue;
    public int wValue;

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
//            value += newPiece.value;
            return true;
        }
        else if(!pieceHeld.color.equals(newPiece.color)){
            pieceHeld.kill();
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
    public void update() {
        if (pieceHeld != null && threatenedBy.size() != 0){
            int whiteCount = 0;
            int blackCount = 0;
            for(Piece piece : threatenedBy) {
                if(piece.color.equalsIgnoreCase("black")){
                    blackCount++;
                }
                else if(piece.color.equalsIgnoreCase("white")){
                    whiteCount++;
                }
            }
            if(whiteCount > blackCount){
                if(blackCount > 0){
                    wValue -= blackCount * 2;
                }
                else{
                    bValue += whiteCount;
                }
            }
//            value = pieceHeld.value;
        }

    }

    @Override
    public String toString() {
        return "Tile{" +
                "pieceHeld=" + pieceHeld +
                '}';
    }
}
// 40ef3b88071b99f733c5dacd1e2b7982f5b576b1
