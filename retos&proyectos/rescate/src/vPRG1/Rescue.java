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
        boolean isPlaying = true;
        final int MAX_MOVEMENTS = 50;
        int movements = 0;

        while (isPlaying) {
            movements++;
            printSea(sea, movements);
            askMovement(sea);
            isPlaying = (movements < MAX_MOVEMENTS && countRescued(sea) < MAX_SOLDIERS);
        }
    }

    static void askMovement(int[][] sea) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa fila y columna");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (sea[row][col] < 0) {
            sea[row][col] = sea[row][col] * -1;
        }
    }

    static int countRescued(int[][] sea) {
        int soldiersNumber = 0;
        for (int row = 0; row < sea.length; row++) {
            for (int col = 0; col < sea[row].length; col++) {
                if (sea[row][col] == 2) {
                    soldiersNumber++;
                }
            }
        }
        return soldiersNumber;
    }

    static void printSea(int[][] sea, int movements) {
        printLine(sea.length);
        System.out.println("Turno " + movements + " / " + "Rescatados " + countRescued(sea));
        printLine(sea.length);
        for (int row = 0; row < sea.length; row++) {
            for (int col = 0; col < sea[row].length; col++) {
                System.out.print(map(sea[row][col]));
            }
            System.out.println();
        }
        printLine(sea.length);
    }

    private static void printLine(int length) {
        System.out.println("---".repeat(length));
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
