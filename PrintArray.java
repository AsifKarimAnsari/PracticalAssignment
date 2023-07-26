package PracticalAssignment;

public class PrintArray {

    public static void printIntArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line after printing the array
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Array elements: ");
        printIntArray(numbers);
    }
}