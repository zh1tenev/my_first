package org.first.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int i = 0; i < postfix.length - 1; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
