package org.first.calc;

public class Fit {
    public static float manWeight(float height) {
        return (height - 100) * 1.15f;
    }

    public static float womanWeight(float height) {
        return (height - 110) * 1.15f;
    }

    public static void main(String[] args) {
        short height = 190;
        short height2 = 169;
        System.out.println("Man 190 is " + Fit.manWeight(height));
        System.out.println("Man 169 is " + Fit.womanWeight(height2));
    }
}
