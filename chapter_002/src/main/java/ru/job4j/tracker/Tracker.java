package ru.job4j.tracker;
import java.lang.String;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import ru.job4j.tracker.Items;
import java.util.Arrays;
public class Tracker {
    private final Items[] items = new Items[100];
    private int position = 0;


    private final Items[] itemss = new Items[100];

  public  Items add(Items items) {
      items.setId(this.generateId());
      this.itemss[this.position++] = items;
      return items;


  }
    public String generateId() {
        Random rm = new Random();
        String str = String.valueOf(rm.nextLong() +"="+ System.currentTimeMillis());
        return str;
    }


    public  boolean delete(String id) {
        boolean res = false;
        Items temp = new Items(null);
        int index = 0;
        for (int i=0; i < this.position; i++ ) {
            if (itemss[i].getId().equals(id)) {
                temp = itemss[i];
                for (int j=i; j < this.position-1; j++ ) {
                    itemss[j] = itemss[j+1];
                }
                itemss[i] = temp;
                res =  true;
            } else  {res =  false;}
        }

        return res;
    }


    public boolean replace(String id, Items item) {
        boolean res = false;
        for (int i = 0; i < this.position; i++) {
            if ((this.itemss[i].getId().equals(item.getId()))) {
               this.itemss[i].setName(item.getName());
                res = true;
            } else  {res = false;}
        }
        return res;
    }



   //// -----------------
    public Items[] findAll() {
        return Arrays.copyOf(this.itemss, this.position);
    }
    //// -----------------
    public Items[] findByName(String key) {
        int cnt = 0;
        Items[] tempItem = new Items[this.position];
        tempItem = Arrays.copyOf(this.itemss,this.position );
        return tempItem;
    }
    public Items findById(String id) {
      Items ret = new Items(null);
     for (int i = 0; i < this.position; i++ ) {
         if ( ( this.itemss[i].getName().equals(id))) {
              ret = this.itemss[i];
         }
     }
        return ret;
    }

}
