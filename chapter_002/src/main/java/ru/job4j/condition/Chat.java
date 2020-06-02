package ru.job4j.condition;

public final class Chat {
    private Chat() {
        //not called
    }

    /**
     * @param args ar
     */
    public static void main(final String[] args) {
        String questionOne;
        String questionTwo;
        String questionThree;
        String questionFour;
        String questionFive;
        questionOne = "Это я";
        ru.job4j.condition.DummyBot bot =
                new ru.job4j.condition.DummyBot(questionOne);
        questionTwo = "Ха ха";
        System.out.println("I Say: " + questionTwo);
        System.out.println("Bot answer: " + bot.answer(questionTwo));
        questionThree = "Привет, бот!";
        System.out.println("I Say: " + questionThree);
        System.out.println("Bot answer: " + bot.answer(questionThree));
        //System.out.println(bot.answer(questionThree));
        questionFour = "Доброго!";
        System.out.println("I Say: " + questionFour);
        System.out.println("Bot answer: " + bot.answer(questionFour));
    }

}
