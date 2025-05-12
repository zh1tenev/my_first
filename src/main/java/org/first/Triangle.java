package org.first;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac
                              && ac > 0 && bc > 0 && ab > 0;
    }
}
