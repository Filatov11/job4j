package oop;

public class DummyDic {
    public void engToRus(String eng) {
        System.out.println("Неизвестное слово. " + eng);
    }
    public static  void main(String[] args){
        DummyDic dictionary = new DummyDic();
        dictionary.engToRus("Word");
    }


}
