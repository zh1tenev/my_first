package org.first;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println(number + ": this is negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(4);
        AlertDivByZero.checkNumber(0);
        AlertDivByZero.checkNumber(-4);
    }
}
