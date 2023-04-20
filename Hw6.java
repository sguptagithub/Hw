package HW;

import java.util.Scanner;

public class Hw6 {
    //Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
