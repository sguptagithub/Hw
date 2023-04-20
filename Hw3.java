package HW;

public class Hw3 {
    /*Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only. */
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        // Identify and print the even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}

