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
        float input = 183.4F;
        float expected = 2;
        float output = rubToEuro(input);
        boolean passed = expected == output;
        input = 161.54F;
        float output2 = rubToDollar(input);
        boolean passed2 = expected == output2;
        System.out.println("183.4 coins int Euro are 2. Test result : " + passed);
        System.out.println("161.54 coins are 2. Test result : " + passed2);
    }
}
