package PracticalAssignment;

public class FindElementIndex {

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int targetElement = 30;
        int index = findIndex(numbers, targetElement);
        
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
