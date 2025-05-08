package org.first.calc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConvTest {

    @Test
    void whenConvert161point54RubThen2Dollar() {
        float input = 161.54F;
        float expected = 2;
        float output = Conv.rubToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert183point4RubThen2Euro() {
        float input = 183.4F;
        float expected = 2;
        float output = Conv.rubToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}