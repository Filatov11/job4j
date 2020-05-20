package oop;

/**.
 * DummyDic
 */
public class DummyDic {
    /**
     *
     * @param eng qq
     */
    public final void engToRus(final String eng) {
        System.out.println("Неизвестное слово. " + eng);
    }
    public static  void main(final String[] args) {
        DummyDic dictionary = new DummyDic();
        dictionary.engToRus("Word");
    }


}
