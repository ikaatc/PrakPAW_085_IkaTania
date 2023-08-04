package com.helloworld.helloworld;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Ika", "Tania", "Chaerani",
                "Yang", "Sangat", "Comel"
        };

        for (var value : array) {
            System.out.println(value);
        }
    }
}
