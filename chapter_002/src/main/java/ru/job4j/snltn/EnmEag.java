package ru.job4j.snltn;
import ru.job4j.tracker.Tracker;
public class EnmEag {
    public enum SingletonEnum {
        INSTANCE;
        public  static final  Tracker tracker = new Tracker();
    }
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
    }
}
