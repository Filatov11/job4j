package oop;

/**.
 * Story
 */
public class Story {
    /**
     * @param args a
     */
    public static void main(final String[] args) {
        Pioneer petya = new Pioneer();
        Wolf wolf = new Wolf();
        Girl girl = new Girl();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
