package ru.job4j.garbage;

public class LoadOrder {
  private static String static_field = echo("Static field");
  private static final String STATIC_FINAL_FIELD = echo("static final field");
    {
        echo ("non-static block");
    }
    static {
        echo ("static block");
    }
    private String surname  = echo("field");
    private final String name = echo("final field");

    public LoadOrder(String msg) {
        echo("constructor " + msg);
    }
    public static String echo(String text) {
        System.out.println( text);
        return text;
    }
    public static void main(String[] args){
        LoadOrder order;
        //  LoadOrder order = new LoadOrder("main");
    }
}