package vPRG1;

import java.util.Scanner;

class Marco {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        final double INITIAL_DISTANCE = 350;
        final double MOTHER_ADVANCE = 80;
        final double HARD_RAIN = 0.1;
        final double SOFT_RAIN = 0.4;
        double remainingDistance = INITIAL_DISTANCE;
        int days = 0;
        boolean onJourney = remainingDistance > 0;

        while (onJourney) {
            days++;
            double marcoVelocity = Math.random() * 5 + 10;
            double marcoTime = Math.random() * 2 + 8;

            double rainProbability = Math.random();
            double velocityChange = 1;
            String history = "Buen dia";
            if (rainProbability <= HARD_RAIN) {
                velocityChange = 0.25;
                history = "Lluvia fuerte!";
            } else if (rainProbability <= SOFT_RAIN) {
                velocityChange = 0.75;
                history = "Lluvia suave!";
            }
            marcoVelocity = marcoVelocity * velocityChange;

            double marcoAdvance = marcoVelocity * marcoTime;

            remainingDistance = remainingDistance - marcoAdvance + MOTHER_ADVANCE;

            System.out.println("Dia " + days);
            System.out.println(history);
            System.out.println("Marco avanzó " + marcoAdvance);
            System.out.println("Lo separa de su madre " + remainingDistance + " Km.");
            System.out.println("-".repeat(10));

            onJourney = remainingDistance > 0;
        }
        System.out.println("Marco se encuentra con su madre después de " + days + " días!");
    }
}
