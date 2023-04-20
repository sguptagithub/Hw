package HW;

import java.util.Scanner;

public class Hw8 {
    //Maximum and minimum number in the array?
         public static void main(String[] args) {
            int[] numbers = {10, 5, 20, 15, 25, 30};
            int max = numbers[0];
            int min = numbers[0];

            for(int i=1; i<numbers.length; i++) {
                if(numbers[i] > max) {
                    max = numbers[i];
                }
                if(numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Maximum value in the array: " + max);
            System.out.println("Minimum value in the array: " + min);
        }
    }

