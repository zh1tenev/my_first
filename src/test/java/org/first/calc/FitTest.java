package org.first.calc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FitTest {

    @Test
    void manWeight() {
        float manHeight = 190;
        double expected = 103.5;
        float output = Fit.manWeight(manHeight);
        assertThat((double) output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void womanWeight() {
        float womanHeight = 169;
        double expected = 67.85;
        float output = Fit.womanWeight(womanHeight);
        assertThat((double) output).isEqualTo(expected, withPrecision(0.01));
    }
}