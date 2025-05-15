package org.first.loops;

public class Limit {
    public static int calc(int first, int second) {
        int month = 0;
        while (first <= second) {
            first *= 3;
            second *= 2;
            month++;
        }
        return month;
    }
}
