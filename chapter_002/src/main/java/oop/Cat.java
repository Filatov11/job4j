package oop;

public class Cat {
    private String food, name;
    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }
    public String sound() {
        String voice = "may-may";
        return voice;
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.show();

        System.out.println("There are gav's food.");
        Cat gav1 = new Cat();
        gav1.eat("kotleta");
        gav1.giveNick("gav1");
        gav1.show();
        System.out.println("There are black's food.");
        Cat black1 = new Cat();
        black1.eat("fish");
        black1.giveNick("Black");
        black1.show();
    }
}
