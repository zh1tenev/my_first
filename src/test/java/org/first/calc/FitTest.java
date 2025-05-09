package org.first.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FitTest {

    private static final double DELTA = 0.001; // точность сравнения double

    @Test
    void testManWeight() {
        assertEquals(103.5, Fit.manWeight(190), DELTA);
        assertEquals(74.75, Fit.manWeight(165), DELTA);
        assertEquals(0.0, Fit.manWeight(100), DELTA); // предельное значение
    }

    @Test
    void testWomanWeight() {
        assertEquals(80.5, Fit.womanWeight(180), DELTA);
        assertEquals(67.85, Fit.womanWeight(169), DELTA);
        assertEquals(0.0, Fit.womanWeight(110), DELTA); // предельное значение
    }
}