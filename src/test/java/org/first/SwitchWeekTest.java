package org.first;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void nameOfMonday() {
        assertThat(SwitchWeek.nameOfDay(1)).isEqualTo("Monday");
    }

    @Test
    void nameOfTuesday() {
        assertThat(SwitchWeek.nameOfDay(2)).isEqualTo("Tuesday");
    }

    @Test
    void nameOfWednesday() {
        assertThat(SwitchWeek.nameOfDay(3)).isEqualTo("Wednesday");
    }

    @Test
    void nameOfThursday() {
        assertThat(SwitchWeek.nameOfDay(4)).isEqualTo("Thursday");
    }

    @Test
    void nameOfFriday() {
        assertThat(SwitchWeek.nameOfDay(5)).isEqualTo("Friday");
    }

    @Test
    void nameOfSaturday() {
        assertThat(SwitchWeek.nameOfDay(6)).isEqualTo("Saturday");
    }

    @Test
    void nameOfSunday() {
        assertThat(SwitchWeek.nameOfDay(7)).isEqualTo("Sunday");
    }

    @Test
    void nameOfUnknown() {
        assertThat(SwitchWeek.nameOfDay(11)).isEqualTo("Unknown");
    }
}