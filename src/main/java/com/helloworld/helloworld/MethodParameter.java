package com.helloworld.helloworld;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Ika", "Tania");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
