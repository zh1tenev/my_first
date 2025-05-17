package org.first.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] a = new short[10];
        String[] b = new String[100500];
        float[] c = new float[40];
        System.out.println("Размер массива равен: " + a.length);
        System.out.println("Размер массива равен: " + b.length);
        System.out.println("Размер массива равен: " + c.length);
        b[0] = "First";
        b[1] = "Second";
        b[2] = "Third";
        b[3] = "Fourth";
        b[4] = "Fifth";
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
    }
}
