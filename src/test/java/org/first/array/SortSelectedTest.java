package org.first.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSorted() {
        int[] data = new int[] {6, 3, 4, 1, 2, 5, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }
}