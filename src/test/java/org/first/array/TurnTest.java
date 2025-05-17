package org.first.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {
    @Test
    void whenTurnArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayLengthIs5() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayLengthIs7() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}