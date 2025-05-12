package org.first;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {
    @Test
    void nameOfMonday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Monday")).isEqualTo(1);
    }

    @Test
    void nameOfTuesday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Tuesday")).isEqualTo(2);
    }

    @Test
    void nameOfWednesday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Wednesday")).isEqualTo(3);
    }

    @Test
    void nameOfThursday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Thursday")).isEqualTo(4);
    }

    @Test
    void nameOfFriday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Friday")).isEqualTo(5);
    }

    @Test
    void nameOfSaturday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Saturday")).isEqualTo(6);
    }

    @Test
    void nameOfSunday() {
        assertThat(MultipleSwitchWeek.numberOfDay("Sunday")).isEqualTo(7);
    }

    @Test
    void nameOfUnknown() {
        assertThat(MultipleSwitchWeek.numberOfDay("NewDay")).isEqualTo(-1);
    }
}