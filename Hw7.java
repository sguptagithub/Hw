package HW;

public class Hw7 {
//Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int n = 10;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("First 10 numbers of Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}

