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

        final int MAX_SOLDIERS = 16;

        putSoldiers(sea, MAX_SOLDIERS);

        printSea(sea);
    }

    static void printSea(int[][] sea) {
        for (int row = 0; row < sea.length; row++) {
            for (int col = 0; col < sea[row].length; col++) {
                System.out.print(sea[row][col]);
            }
            System.out.println();
        }
    }

    static String map(int i) {
        String[] caracter = { " ? ", " ~ ", "\\O/" };
        return i < 0 ? " ? " : caracter[i];
    }

    static void putSoldiers(int[][] sea, int maxSoldiers) {
        int soldiersNumber = 0;
        while (soldiersNumber < maxSoldiers) {
            int row = (int) (Math.random() * 8);
            int col = (int) (Math.random() * 8);
            if (sea[row][col] != -2) {
                sea[row][col] = -2;
                soldiersNumber++;
            }
        }
    }
}
