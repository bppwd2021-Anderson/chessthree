package com.company;

public class Main {

    public static void main(String[] args) {
        Tile[][] myArr = new Tile[4][4];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                Tile tempTile = new Tile(i,j);
                myArr[i][j] = tempTile;
            }
        }
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                System.out.print("[" + myArr[i][j].location[0] + ", " + myArr[i][j].location[1] + "]");
            }
            System.out.println();
        }
    }
}
