package com.helloworld.helloworld;

public class FactorialRecurcive {
    public static void main(String[] args) {
        int number = 3;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    static int factorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
