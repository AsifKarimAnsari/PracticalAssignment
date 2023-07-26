package PracticalAssignment;

public class ArraySum {

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 4, 5};

        int sum = calculateSum(numbers);

        System.out.println("Sum of elements in the array: " + sum);
    }
}