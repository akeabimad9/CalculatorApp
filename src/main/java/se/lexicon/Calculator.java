package se.lexicon;


public class Calculator {
    // Method for addition
    public double add(double num1, double num2) {
     return num1 + num2;
 }
 // Method for subtraction
     public double subtract(double num1, double num2) {
           return num1 - num2;
     }
// Method for multiplication
     public double multiply(double num1, double num2) {
           return num1 * num2; }
// Method for division
     public double divide(double num1, double num2) {
       if (num2 == 0) {
           System.out.println("Error: Division by zero is not allowed.");
           return 0;
          }
            return num1 / num2;
     } }

