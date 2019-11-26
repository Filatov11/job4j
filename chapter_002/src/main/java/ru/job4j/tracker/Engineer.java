package ru.job4j.tracker;
import java.util.Date;
public class Engineer extends Profession {
    String speciality;
    int experience;
    boolean drawing;

    public Engineer(String name, String surname, String education, Date birthday  ) {
        super(name, surname, education,  birthday );

    }
    public void work(String material) {

    }
    public void draw(boolean dr){
        this.drawing = dr;
    }
    public void work(boolean dw){
        this.drawing = dw;
    }

}
