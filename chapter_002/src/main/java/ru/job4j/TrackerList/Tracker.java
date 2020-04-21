package ru.job4j.TrackerList;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class Tracker {
   private final List<Item>  itemsList = new ArrayList<>();
  //  private int position = 0;
//    public int getPosition() {
    //    return position;
  ///  }
  public Item add(Item items) {
      items.setId(this.generateId());
      //items.setName();
        itemsList.add(items);


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
        for ( Item itm : itemsList ) {
            if (itm.getId() == id) { itemsList.remove(pos) ; res = true; break; }
            pos++;
        }
        return res;
    }


    public boolean replace(String id, Item item) {
        boolean res = false;
        int pos = 0;
        for ( Item itm : itemsList ) {
            if (itm.getId() == id) { itemsList.set(pos, item) ; res = true; break; }
            pos++;
        }
        return res;
    }



   //// -----------------
    public List<Item> findAll() {
        return this.itemsList;
    }

    //// -----------------
    public List<Item> findByName(String key) {
        int cnt = 0;
        List<Item> temp =  new ArrayList<>();
        for ( Item itm : itemsList ) {
            if (itm.getName() == key) { temp.add(itm); }
        }
        return temp;
    }



    public Item findById(String id) {
      Item ret = new Item(null);
        for ( Item itm : itemsList ) {
            if (itm.getId() == id) { ret = itm; break; }
          //  pos++;
        }
        return ret;
    }

}
