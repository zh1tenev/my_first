package org.first.loops;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LimitTest {
    @Test
    void whenFirstGreatSecond() {
        int first = 95;
        int second = 90;
        int result = Limit.calc(first, second);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirstLessByOneSecond() {
        int first = 90;
        int second = 95;
        int result = Limit.calc(first, second);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirstLessByFewSecond() {
        int first = 50;
        int second = 90;
        int result = Limit.calc(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirstEqualsSecond() {
        int first = 90;
        int second = 90;
        int result = Limit.calc(first, second);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}