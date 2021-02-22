package com.company;

public class Main {

    public static void main(String[] args) {
        Tile[][] grid = new Tile[8][8]; //The average chess board is 8x8, we can make it custom later
        // This is for populating the grid with the tiles
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Tile tempTile = new Tile(row,col);
                grid[row][col] = tempTile;
            }
        }
        // This is just for printing out, not important right now
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
//                System.out.print("[" + grid[i][col].location[0] + ", " + grid[i][col].location[1] + "]"); // This is for showing the tile coords
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
        //this comment is to allow committing
    }
}
