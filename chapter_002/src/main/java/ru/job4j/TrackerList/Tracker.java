package ru.job4j.TrackerList;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class Tracker {
  //  private final Items[] items = new Items[100];
   private ArrayList<Items>  itemsList = new ArrayList<>();
    private int position = 0;
    private final Items[] itemss = new Items[100];
    public int getPosition() {
        return position;
    }
  public Items add(Items items) {
        itemsList.add(items);
      items.setId(this.generateId());
   //   this.itemss[this.position++] = items;
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
    public ArrayList<Items> findAll() {
        return this.itemsList;
    }

    //// -----------------
    public ArrayList<Items> findByName(String key) {
        int cnt = 0;
        ArrayList<Items> temp =  new ArrayList<>();
        for ( Items itm : itemsList ) {
            if (itm.getName() == key) { temp.add(itm); }
        }
        return temp;
    }



    public Items findById(String id) {
      Items ret = new Items(null);
        for ( Items itm : itemsList ) {
            if (itm.getId() == id) { ret = itm; break; }
            pos++;
        }
        return ret;
    }

}
