package ru.job4j.ex;

public class FindEl {
    public static void main(String[] args) {
        String[] searchArray = {"object", "search", "word"};
        try {
            int index;
            index = indexOf(searchArray, "Smith");
        } catch (ElementNotFoundException e) {
           e.printStackTrace();
        }
    }
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        boolean searchArrayResult = false;


        for (int i = 0; i <= value.length - 1; i++) {
            //rsl++;
            if (value[i].equals(key)) {
                rsl = i;
              //  searchArrayResult = true;

                break;
            }
        }
       // if (!searchArrayResult) { rsl=-1;}

        if (rsl == -1) {
            throw new ElementNotFoundException("Element id not found");
        } else {
            return rsl;
        }
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        // if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
