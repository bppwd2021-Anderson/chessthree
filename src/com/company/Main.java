package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] myArr = new int[8][8];
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                myArr[i][j] = i+j*j;
            }
        }
    }
}
