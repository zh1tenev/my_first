package org.first;

public class SimpleBot {
    public static String answer(String ask) {
        String answer = "I don't know, Please, ask another question.";
        if ("Hi, Bot.".equals(ask)) {
            answer = "Hello, user!";
        } else if ("Bye, Bot.".equals(ask)) {
            answer = "See you later.";
        }
        return answer;
    }

    public static void main(String[] args) {
        String ask = "Hi, Bot.";
        String answer = answer(ask);
        System.out.println(answer);
        ask = "Bye, Bot.";
        answer = answer(ask);
        System.out.println(answer);
        ask = "Hello!";
        answer = answer(ask);
        System.out.println(answer);
    }
}
