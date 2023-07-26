package PracticalAssignment;

public class MethodOverloading {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two double numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public static String add(String str1, String str2) {
        return str1 + str2;
    }

public static void main(String[] args) {
    int num1 = 10, num2 = 20;
    double double1 = 3.14, double2 = 1.1;
    String str1 = "Hello, ";
    String str2 = "World!";

    // Method overloading is based on the parameter types.
    int sumInt = add(num1, num2);
    double sumDouble = add(double1, double2);
    String concatStrings = add(str1, str2);

    System.out.println("Sum of integers: " + sumInt);
    System.out.println("Sum of doubles: " + sumDouble);
    System.out.println("Concatenated strings: " + concatStrings);
}
}

