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
       int index = indexOf(id);
       if ( index == -1) {
           return  false;
       }
       itemsList.remove(index);
       return true;
    }


    public boolean replace(String id, Item item) {
     int index = indexOf(id);
     if (index == -1) {
         return false;
     }
     item.setId(id);
     itemsList.set(index, item);
     return true;

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
            if (itm.getName().equals(key)) {
                temp.add(itm);
            }
        }
        return temp;
    }



    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? itemsList.get(index) : null;
    }

     private int indexOf(String id) {
      int index = -1;
      for (int i = 0; i < itemsList.size(); i++) {
         if  (itemsList.get(i).getId().equals(id)) {
             index = i;
             break;
         }

      }
      return index;
     }


}
