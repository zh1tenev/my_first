package org.first;

public class Home {
    public static void permission(boolean familyMember, boolean beFriend) {
        if (familyMember || beFriend) {
            System.out.println("Can go to the home.");
        } else {
            System.out.println("Can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
