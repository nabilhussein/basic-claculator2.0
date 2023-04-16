package org.example.cal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //This is to welcome the user

        System.out.println("Welcome I'll add two number, but first, ");
        System.out.print("What is your name? ");

        //First ask for the name , to be polite
        //example of scanner
        Scanner consInput = new Scanner(System.in);
        String name = consInput.nextLine();
        System.out.println("Good to be working with you, " + name);

        System.out.print("Enter a number");
        double number1 = consInput.nextDouble();
        System.out.println("Number 1:" + number1);

        System.out.print("Enter another number");
        double number2 = consInput.nextDouble();
        System.out.println("Number 2:" + number2);
        //clean up the input buffer

        boolean badInput = false;

        do {
            System.out.print("Please enter one of {add, subtract, multiply, divide}");
            String op = consInput.next();

            if (op.equalsIgnoreCase("add")) {
                // Add them
                doAdd(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("subtract")) {
                // Subtract them
                doSubtract(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("divide")) {
                // Divide them
                doDivide(number1, number2);
                break;
            } else if (op.equalsIgnoreCase("multiply")) {
                // Divide them
                doMultiply(number1, number2);
                break;
            } else {
                System.out.println("I didn't understand that.... Please try again ");
                badInput = true;
            }
        } while (badInput);
    }

    private static void doDivide(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("result is "  + result);
    }

    static void doAdd(double number1, double number2){
        double result = number1 + number2;
        System.out.println("result is " + result);
    }
    static void doSubtract(double number1, double number2){
        double result = number1 - number2;
        System.out.println("result is " + result);
    }
    static void doMultiply(double number1, double number2){
        double result = number1 / number2;
        System.out.println("result is " + result);
    }
}
