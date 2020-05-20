package oop;
/**.
 * Cat
 */
public class Cat {
    /**.
     * food f
     * name n
     */
    private String food, name;

    /**
     * show
     */
    public final void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    /**
     *
     * @return voice v
     */
    public final String sound() {
        String voice = "may-may";
        return voice;
    }

    /**
     *
     * @param meat m
     */
    public final void eat(final String meat) {
        this.food = meat;
    }

    /**
     *
     * @param nick ni
     */
    public final void giveNick(final String nick) {
        this.name = nick;
    }

    /**
     *
     * @param args a
     */
    public static void main(final String[] args) {
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
