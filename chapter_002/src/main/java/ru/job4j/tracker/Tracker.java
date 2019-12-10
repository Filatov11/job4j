package ru.job4j.tracker;
import java.lang.String;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import ru.job4j.tracker.Items;
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
       // int randomInteger = rm.nextInt();
        //DateFormat dateFormat = new SimpleDateFormat("YYYY_MM_dd_HH_mm_ss");
        //Date date = new Date();
       // String stringId = dateFormat.format(date) + randomInteger;
       // return stringId;
    }


    public  boolean delete(String id) {
       boolean res = false;
        for (int i=0; i < itemss.length; i++ ) {
            if (itemss[i].getId().equals(id)) {
                itemss[i] = null;
                res =  true;
            } else  {res =  false;}
        }
        return res;
    }
   // public boolean replace(String id, Items item) {
//     boolean res = false;
 //    for (int i=0; i < itemss.length; i++ ) {
   //      System.out.println(itemss[i].getId());
   //      if (itemss[i].getId().equals(item.getId())) {
   //          itemss[i].setName(item.getName());
   //         res = true;
  //       } else  {res = false;}
//     }
 //       return res;
//    }


    public boolean replace(String id, Items item) {
        boolean res = false;
        for (Items i: itemss) {
            if ((i != null) && (i.getId().equals(item.getId()))) {
                i.setName(item.getName());
                res = true;
            } else  {res = false;}
        }
        return res;
    }



   //// -----------------
    public Items[] findAll() {
        int count = 0;

       /// Items[] itemsNotNull = new Items[0];
        for (int i = 0; i < itemss.length; i++) {
            if (itemss[i] == null) {
                count++;
            }
        }
        Items[] itemsNotNull = new Items[count];
            int cnt = 0;
            for (int i = 0; i < itemss.length; i++) {
                if (this.itemss[i] != null) {
                    itemsNotNull[cnt] = this.itemss[i];
                    cnt++;
                }
            }

        return itemsNotNull;
    }
    //// -----------------
    public Items[] findByName(String key) {
        int cnt = 0;
        for (int i = 0; i < itemss.length; i++) {
            if (itemss[i] == null) {
                cnt++;
            }
        }
     Items[]   itemsSame = new Items[cnt];
       int cntout = 0;
        for (int i = 0; i < itemss.length; i++) {
            if (itemss[i] == null) {
                itemsSame[cntout]=itemss[i];
                cntout++;
            }
        }

        return itemsSame;
    }
    public Items findById(String id) {
      Items ret = new Items(null);
     for (int i = 0; i < this.items.length; i++ ) {
         if ((this.items[i] != null) && ( this.items[i].getName().equals(id))) {
               System.out.println("findById " + this.items[i].getName());
              ret = this.items[i];

         }
     }
        return ret;
    }

}
