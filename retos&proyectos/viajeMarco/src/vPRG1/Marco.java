package vPRG1;

import java.util.Scanner;

class Marco {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        final double INITIAL_DISTANCE = 350;
        final double MOTHER_ADVANCE = 80;
        double remainingDistance = INITIAL_DISTANCE;
        int days = 0;
        boolean onJourney = remainingDistance > 0;

        while (onJourney) {
            days++;

            onJourney = remainingDistance > 0;
        }
    }
}
