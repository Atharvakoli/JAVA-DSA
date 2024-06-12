package project;

import java.util.Scanner;

public class Projects {

    public void averageTemperature() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many days's temperature# ");
        int numDays = userInput.nextInt();
        int[] temps = new int[numDays];
        // record temperature and find average
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = userInput.nextInt();
            sum += temps[i];
        }

        double average = sum / numDays;
        // count days above average
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " Days Above Average ");

        userInput.close();
    }
}
