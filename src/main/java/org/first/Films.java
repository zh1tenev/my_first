package org.first;

public class Films {
    public static void select(String name) {
        if ("star wars".equals(name)) {
            System.out.println("Start - star wars");
        }
        if ("star track".equals(name)) {
            System.out.println("Start - star track");
        }
        if ("star gates".equals(name)) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - star gates");
        }
    }

    public static void main(String[] args) {
        Films.select("star track");
    }
}
