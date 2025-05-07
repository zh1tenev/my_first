package org.first;

public class Greeting {
    public static void main(String[] args) {
        String greeting = "Hello World.";
        System.out.println(greeting);
        greeting = greeting + " I am a newbie. ";
        int year = 2025;
        greeting += year;
        System.out.println(greeting);
    }
}
