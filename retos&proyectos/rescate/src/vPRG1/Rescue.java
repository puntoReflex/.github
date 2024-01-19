package vPRG1;

import java.util.Scanner;

class Rescue {

    public static void main(String[] args) {
        int[][] sea = {
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        printSea(sea);
    }

    static void printSea(int[][] sea) {
        for (int row = 0; row < sea.length; row++) {
            for (int col = 0; col < sea[row].length; col++) {
                System.out.print(map(sea[row][col]));
            }
            System.out.println();
        }
    }

    static String map(int i) {
        String[] caracter = { " ? ", " ~ ", "\\O/" };
        return i < 0 ? " ? " : caracter[i];
    }

}
