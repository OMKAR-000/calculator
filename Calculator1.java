import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");

        System.out.print("Enter the numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        // Check the number of inputs
        if (numbers.length == 2) {
            // Add two numbers
            double num1 = Double.parseDouble(numbers[0]);
            double num2 = Double.parseDouble(numbers[1]);
            double result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (numbers.length == 3) {
            // Add three numbers
            double num1 = Double.parseDouble(numbers[0]);
            double num2 = Double.parseDouble(numbers[1]);
            double num3 = Double.parseDouble(numbers[2]);
            double result = num1 + num2 + num3;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid number of inputs. Please provide either 2 or 3 numbers.");
        }

        scanner.close();
    }
}
