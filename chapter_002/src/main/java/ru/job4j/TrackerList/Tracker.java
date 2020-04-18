package ru.job4j.TrackerList;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class Tracker {
   private List<Items>  itemsList = new ArrayList<>();
    private int position = 0;
    public int getPosition() {
        return position;
    }
  public Items add(Items items) {
        itemsList.add(items);
      items.setId(this.generateId());
      return items;
  }
    public String generateId() {
        Random rm = new Random();
        String str = String.valueOf(rm.nextLong() + System.currentTimeMillis());
        return str;
    }


    public  boolean delete(String id) {
        boolean res = false;
        int pos = 0;
        for ( Items itm : itemsList ) {
            if (itm.getId() == id) { itemsList.remove(pos) ; res = true; break; }
            pos++;
        }
        return res;
    }


    public boolean replace(String id, Items item) {
        boolean res = false;
        int pos = 0;
        for ( Items itm : itemsList ) {
            if (itm.getId() == id) { itemsList.set(pos, item) ; res = true; break; }
            pos++;
        }
        return res;
    }



   //// -----------------
    public List<Items> findAll() {
        return this.itemsList;
    }

    //// -----------------
    public List<Items> findByName(String key) {
        int cnt = 0;
        List<Items> temp =  new ArrayList<>();
        for ( Items itm : itemsList ) {
            if (itm.getName() == key) { temp.add(itm); }
        }
        return temp;
    }



    public Items findById(String id) {
      Items ret = new Items(null);
        for ( Items itm : itemsList ) {
            if (itm.getId() == id) { ret = itm; break; }
          //  pos++;
        }
        return ret;
    }

}
