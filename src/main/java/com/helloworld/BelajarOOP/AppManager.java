package com.helloworld.BelajarOOP;

public class AppManager {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Ika";
        manager.sayHello("Andre");

        var vicePresident = new VicePresident();
        vicePresident.name = "Tania";
        vicePresident.sayHello("Narwastu");
    }
}
