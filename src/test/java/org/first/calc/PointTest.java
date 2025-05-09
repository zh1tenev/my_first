package org.first.calc;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0minus1toMinus20then2() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = -1;
        int x2 = -2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10minus4to97then2() {
        double expected = 11.04;
        int x1 = 10;
        int y1 = -4;
        int x2 = 9;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05to50then2() {
        double expected = 7.07;
        int x1 = 0;
        int y1 = 5;
        int x2 = 5;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}