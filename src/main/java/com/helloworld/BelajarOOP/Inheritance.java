package com.helloworld.BelajarOOP;

public class Inheritance {
    class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    class Manager extends Employee {
        Manager(String name) {
            super(name);
        }
    }

    class VicePresident extends Employee {
        VicePresident(String name) {
            super(name);
        }
    }
}