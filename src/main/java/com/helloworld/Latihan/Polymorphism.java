package com.helloworld.Latihan;

public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Ika");
        employee.sayHello("Tania");

        employee = new Manager("Ika");
        employee.sayHello("Tania");

        employee = new VicePresident("Ika");
        employee.sayHello("Tania");

        sayHello(new Employee("Ika"));
        sayHello(new Manager("Andre"));
        sayHello(new VicePresident("Tania"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
