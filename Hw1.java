package HW;

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {
/*1.	Create a program that uses an array to store a list of temperatures for a week, and then uses
 a loop to find the highest and lowest temperature for the week.*/
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[7];
        // Read in the temperatures for each day of the week
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the temperature for day " + (i+1) + ": ");
            temperatures[i] = scanner.nextInt();
        }
        // Find the highest and lowest temperatures
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
            }
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }
        System.out.println("The highest temperature for the week was " + highestTemp + " degrees.");
        System.out.println("The lowest temperature for the week was " + lowestTemp + " degrees.");
    }
}



