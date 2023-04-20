package HW;

public class Hw2 {
    /*2. Create an array of integer values. After the array is created, calculate the sum of
    all stored elements in that array.*/
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {2, 4, 6, 8, 10};

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the elements in the array is " + sum);
    }
}

