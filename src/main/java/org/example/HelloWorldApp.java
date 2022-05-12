package org.example;

public class HelloWorldApp {

    public static String greet(String name) {
        return "Hello " + name + "!";
    }

    public static String greet() {
        return greet("World");
    }
}
