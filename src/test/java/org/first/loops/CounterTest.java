package org.first.loops;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void sumFrom0To10() {
        assertThat(55).isEqualTo(Counter.sum(0, 10));
    }

    @Test
    void sumFrom3To8() {
        assertThat(33).isEqualTo(Counter.sum(3, 8));
    }

    @Test
    void sumFrom10To1() {
        assertThat(0).isEqualTo(Counter.sum(10, 1));
    }
}