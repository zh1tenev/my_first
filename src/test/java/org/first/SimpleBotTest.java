package org.first;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.first.SimpleBot.answer;

class SimpleBotTest {

    @Test
    void whenAskHiToBot() {
        String ask = "Hi, Bot.";
        String answer = answer(ask);
        assertThat("Hello, user!").isEqualTo(answer);
    }

    @Test
    void whenAskByeToBot() {
        String ask = "Bye, Bot.";
        String answer = answer(ask);
        assertThat("See you later.").isEqualTo(answer);
    }

    @Test
    void whenAskAnotherQuestionToBot() {
        String ask = "BB!";
        String answer = answer(ask);
        assertThat("I don't know, Please, ask another question.").isEqualTo(answer);
    }

    @Test
    void whenAskNextAnotherQuestionToBot() {
        String ask = "Hello!";
        String answer = answer(ask);
        assertThat("I don't know, Please, ask another question.").isEqualTo(answer);
    }
}