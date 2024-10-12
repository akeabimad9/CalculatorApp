package se.lexicon;

import java.util.Scanner;

public class CalculatorApp
{
    public static void
    main(String[] args) {
        // Create an instance of the Calculator
        // class
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        // Take inputs from the user

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        double result = 0; boolean validOperation = true;

        // Perform the chosen operation using the Calculator class methods
        switch (operation)
        {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation selected.");

                validOperation = false;
        }

        // Output the result if the operation is valid
        if (validOperation) {
            System.out.println("The result of the operation is: " + result);
        }
    }
}


