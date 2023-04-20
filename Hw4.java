package HW;

public class Hw4 {

    /*Create a 2D array of integers. Develop a program which will calculate the sum of
    even and odd numbers for that array.  */
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        // Calculate the sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}


