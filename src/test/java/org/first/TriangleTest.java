package org.first;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TriangleTest {

    @Test
    void when222Exist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void when346Exist() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 6.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void when228NotExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void when208NotExist() {
        double ab = 2.0;
        double ac = 0.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void when000NotExist() {
        double ab = 0.0;
        double ac = 0.0;
        double bc = 0.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}