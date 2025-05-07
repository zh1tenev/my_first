package org.first.calc;

public class Conv {
    public static float rubToEuro(float r) {
        return r / 91.7F;
    }

    public static float rubToDollar(float r) {
        return r / 80.77F;
    }

    public static void main(String[] args) {
        System.out.println("Одна тысяча монет в долларах это: " + Conv.rubToDollar(1000));
        System.out.println("Одна тысяча монет в евро это: " + Conv.rubToEuro(1000));
    }
}
