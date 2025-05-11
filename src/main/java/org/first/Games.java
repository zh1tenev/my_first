package org.first;

public class Games {
    public static void permission(boolean haveComputer, boolean haveGame) {
        if (haveComputer && haveGame) {
            System.out.println("I can play the computer game.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
