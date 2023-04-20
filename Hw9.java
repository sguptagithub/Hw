package HW;

import java.util.Scanner;

public class Hw9 {
    //Write a java program to find the second largest number in the array?
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 10, 6};
        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);}}


