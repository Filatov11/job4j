package oop;

/**.
 * Jukebox
 */
public class Jukebox {
    /**
     *
     * @param position p
     */
    public final void  music(final int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
             System.out.println("Спокойной ночи");
         }  else {
                    System.out.println("нет песни: 1 или 2 ");
                }
    }

    /**
     *
     * @param args a
     */
    public static void  main(final String[] args) {
        Jukebox petya = new Jukebox();

        petya.music(1);
        petya.music(2);
        petya.music(3);

    }
}
