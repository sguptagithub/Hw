package HW;

public class Hw5 {
   // Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swap a and b without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

