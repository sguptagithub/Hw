package HW;

import java.util.HashMap;
import java.util.Map;

public class Hw10 {
    //Write a program to print out duplicate elements from an Array of Strings?
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "apple"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }
        }
    }
}

