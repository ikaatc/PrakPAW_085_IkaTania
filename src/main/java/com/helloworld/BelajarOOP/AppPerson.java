package com.helloworld.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person = new Person();
        // AppPerson person2 = new AppPerson();

        // AppPerson person3;
        // person3 = new AppPerson();

        person.name = "Ika";
        person.address = "Pky";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}
