package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args) {
        String[] searchArray = {"object", "search", "word"};
        try {   int index;
            index=indexOf(searchArray, "Smith");
        } catch (ElementNotFoundException e) {
           e.printStackTrace();
        }
    }
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        boolean searchArrayResult = false;
        for (String str : value){
            rsl++;
            if (str.equals(key)) {
                searchArrayResult = true;
                break;
            }
        }
        if (!searchArrayResult) { rsl=-1;}
        if ( rsl==-1) {
            throw new ElementNotFoundException("Element id not found");
        }
        else {return rsl;}
    }
}
