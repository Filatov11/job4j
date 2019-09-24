package ru.job4j.condition;
public class DummyBot {
    public String ini;

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, бот!".equals(question)) {
            rsl = "Доброго дня!";
        } else if (("Доброго!").equals(question)) {
             {
                rsl = "Приятного аппетита!";
                 return rsl;
            }
        }


            return rsl;
}


    DummyBot( String iniString) {
        this.ini = iniString;
        System.out.println("Да, " + iniString );
    }
}
