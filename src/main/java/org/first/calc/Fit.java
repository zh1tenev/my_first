package org.first.calc;

public class Fit {

    /**
     * Расчёт идеального веса мужчины по росту.
     * Формула: (рост - 100) * 1.15
     *
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Расчёт идеального веса женщины по росту.
     * Формула: (рост - 110) * 1.15
     *
     * @param height рост в сантиметрах
     * @return идеальный вес в килограммах
     */
    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
