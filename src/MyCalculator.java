import java.util.*;

public class MyCalculator {

    // Main
    public static void main(String[] args) {
        // Take the inputs
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        long num1 = scan.nextLong();
        System.out.println("Please enter your second number: ");
        long num2 = scan.nextLong();

        // Method Calls + Outputs
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }

    // Add method
    public static long add(long x, long y) {
        long result = x + y;
        return result;
    }

    // Subtract method
    public static long subtract(long x, long y) {
        long result = x - y;
        return result;
    }

    // Multiplication method
    public static long multiply(long x, long y) {
        long result = x * y;
        return result;
    }

    // Division method
    public static float divide(float x, float y) {
        float result = x / y;
        return result;
    }
}
