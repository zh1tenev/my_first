package org.first.calc;

public class Calc {
    public static int plusInt(int a, int b) {
        return a + b;
    }

    public static int divInt(int a, int b) {
        return a / b;
    }

    public static int multiplyInt(int a, int b) {
        return a * b;
    }

    public static int minusInt(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        System.out.println(divInt(six, two));
        System.out.println(minusInt(five, two));
        System.out.println(multiplyInt(four, two));
        System.out.println(plusInt(two, six));
    }
}
