package org.first.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
                for (int i = 0; i < data.length - 1; i++) {
                    if (data[i] != data[i + 1]) {
                        result = false;
                        break;
                    }
                }
        return result;
    }
}
