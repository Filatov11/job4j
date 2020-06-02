package ru.job4j.condition;

public class DummyBot {
    /**.
     * ini
     */
    private final String ini;
    /**
     * @param iniString in
     */
    DummyBot(final String iniString) {
        this.ini = iniString;
        System.out.println("Да, " + iniString);
    }
    /**
     * @param question qq
     * @return ret
     */
    public static String answer(final String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, бот!".equals(question)) {
            rsl = "Доброго дня!";
        } else if (("Доброго!").equals(question)) {
                rsl = "Приятного аппетита!";
                return rsl;
        }


        return rsl;
    }
}
