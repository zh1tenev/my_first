package org.first.loops;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom0To10Then55() {
        assertThat(55).isEqualTo(Counter.sum(0, 10));
    }

    @Test
    void whenSumFrom3To8Then33() {
        assertThat(33).isEqualTo(Counter.sum(3, 8));
    }

    @Test
    void whenSumFrom10To1Then0() {
        assertThat(0).isEqualTo(Counter.sum(10, 1));
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To8Then1() {
        int start = 10;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}