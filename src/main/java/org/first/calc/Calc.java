package org.first.calc;

public class Calc {
    public static void plusInt(int a, int b) {
        System.out.println(a + b);
    }

    public static void divInt(int a, int b) {
        System.out.println(a / b);
    }

    public static void multiplyInt(int a, int b) {
        System.out.println(a * b);
    }

    public static void minusInt(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        divInt(six, two);
        minusInt(five, two);
        multiplyInt(four, two);
        plusInt(two, six);
    }
}
